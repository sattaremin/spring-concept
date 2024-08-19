package com.cydeo.spring10thymeleaf.controller;


import com.cydeo.spring10thymeleaf.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {


    @RequestMapping("/register")
    public String register(Model model){

        model.addAttribute("students", DataGenerator.createStudent());

        return "student/register";

    }

    @RequestMapping("/welcome")
    public String register(){


        return "student/welcome";

    }



}
