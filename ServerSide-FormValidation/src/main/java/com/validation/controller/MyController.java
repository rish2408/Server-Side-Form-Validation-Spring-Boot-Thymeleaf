package com.validation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.validation.entity.Form;

@Controller
public class MyController {

	@GetMapping("/sign-in")
	public String showForm(Model model) {
		
		model.addAttribute("formData", new Form());
		return "form";
	}
	
	@PostMapping("/success")
	public String successForm(@ModelAttribute("formData") Form formData) {
		
		System.out.println(formData);
		return "success";
	}
}
