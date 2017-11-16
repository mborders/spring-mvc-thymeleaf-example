package com.btg.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
public class HomeController {
  @RequestMapping("/")
  public String home(Model model) {
    model.addAttribute("time", new Date());
    return "home";
  }
}
