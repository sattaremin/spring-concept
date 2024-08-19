package com.cydeo.springmvcmodel.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {


    @RequestMapping("/welcome")
    public String homePage(@org.jetbrains.annotations.NotNull Model model){

        model.addAttribute("name","cydeo");
        model.addAttribute("Course","MVC ");

        return "student/welcome";

    }


}
