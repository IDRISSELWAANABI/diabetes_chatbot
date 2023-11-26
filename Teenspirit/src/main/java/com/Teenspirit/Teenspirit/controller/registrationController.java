package com.Teenspirit.Teenspirit.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.Teenspirit.Teenspirit.Dto.userRegistrationDto;
import com.Teenspirit.Teenspirit.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class registrationController {

    private final UserService userService;
    public registrationController(UserService userService)
    {
        this.userService = userService;
    }

    @GetMapping
    public String showRegisterForm(Model model)
    {
        userRegistrationDto user = new userRegistrationDto();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") userRegistrationDto registrationDto)
    {
        userService.saveUser(registrationDto);
        return "redirect:/registration?success";
    }
}
