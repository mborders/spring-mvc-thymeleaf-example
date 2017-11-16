package com.btg.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", "Bob");
        model.addAttribute("age", 23);

        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        model.addAttribute("days", days);

        return "greeting";
    }

}
