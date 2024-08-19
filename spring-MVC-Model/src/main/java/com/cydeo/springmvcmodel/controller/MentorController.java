package com.cydeo.springmvcmodel.controller;

import com.cydeo.springmvcmodel.enums.Gender;
import com.cydeo.springmvcmodel.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {


    @RequestMapping("/list")
    public String showTable(Model model){


        List<Mentor> mentorList =new ArrayList<>();
        mentorList.add(new Mentor("smith","chris",34, Gender.MALE));
        mentorList.add(new Mentor("smith","chris",34, Gender.FEMALE));
        mentorList.add(new Mentor("smith","chris",34, Gender.MALE));

        model.addAttribute("mentors",mentorList);
        return "mentor/mentor-list";



    }





}
