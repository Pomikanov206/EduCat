package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LectureController {
    @GetMapping("/lecture")
    public String lecture(Model model) {
        return "lecture";
    }

    @GetMapping("/lectures")
    public String lectures(Model model) {
        return "lectures";
    }
}
