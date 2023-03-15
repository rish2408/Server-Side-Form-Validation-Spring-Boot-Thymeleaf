package com.validation.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.validation.entity.Form;

import jakarta.validation.Valid;

@Controller
public class MyController {

	@GetMapping("/sign-in")
	public String showForm(Model model) {
		
		model.addAttribute("formData", new Form());
		return "form";
	}
	
	@PostMapping("/success")
	public String successForm(@Valid @ModelAttribute("formData") Form formData, BindingResult result) {
		
		if(result.hasErrors())
		{
			System.out.println(result);
			return "form";
		}
		
		System.out.println(formData);
		return "success";
	}
}
