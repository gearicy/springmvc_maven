package com.lss.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/home")
public class HomeController2 {
    @RequestMapping(path = "/index1")
    public String index(Model model) {
        model.addAttribute("message", "Hello Spring MVC!");
        System.out.println("hsdfak");
        System.out.println("哈哈哈");
        return "home/index";

    }
}
