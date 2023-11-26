package com.Teenspirit.Teenspirit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class appController {


    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

    @GetMapping("/chat")
    public ModelAndView chat()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("chat");
        return modelAndView;
    }

    @GetMapping(value={"/home", "/"})
    public ModelAndView home()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }
}

