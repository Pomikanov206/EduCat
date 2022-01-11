package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {
    @GetMapping("/courses")
    public String list(Model model) {
        return "course-list";
    }

    @GetMapping("/course")
    public String course(Model model) {
        return "course";
    }
}
