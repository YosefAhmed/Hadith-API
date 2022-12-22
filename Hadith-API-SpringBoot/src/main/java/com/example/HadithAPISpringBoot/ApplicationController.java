package com.example.HadithAPISpringBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

    @RequestMapping("/home")
    public String Home() {
        return "home";
    }
}