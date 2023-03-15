# Server Side Form Validation With Spring Boot (Backend) and Thymeleaf (Frontend)
- This project demonstrates how to perform server-side form validation with Spring Boot and Thymeleaf.

## Technologies Used
- Java 11
- Spring Boot 3.0.4
- Thymeleaf 3.0.12
- Bootstrap 5.0.2

# Overview
- The project contains a single controller class, MyController, which handles two requests:

```
GET /sign-in: This request renders the login form using Thymeleaf.
POST /success: This request processes the form submission and performs validation. If validation fails, the user is redirected back to the form with error messages. If validation succeeds, the user is redirected to the success page.
```

- The Form class is a simple POJO that represents the form data. It contains validation annotations from the Jakarta Bean Validation API.

- The form.html template uses Bootstrap for styling and Thymeleaf to bind the form data and validation errors to the HTML form.

# Screenshots

![1](https://user-images.githubusercontent.com/36689521/225265500-f144e798-1129-476d-aa50-f6a19f7a4020.png)
![2](https://user-images.githubusercontent.com/36689521/225265548-49ba219f-1426-4be7-8d82-16d55d0d5f39.png)
![3](https://user-images.githubusercontent.com/36689521/225265676-3bf25175-fc7a-45b3-86ed-e148d0b38497.png)
![4](https://user-images.githubusercontent.com/36689521/225265709-dbd73b74-eb91-416f-86fb-1120af92b263.png)

# Contributions
- Contributions are welcome! If you find a bug or want to add a feature, please create an issue or submit a pull request.

# Thank-You
