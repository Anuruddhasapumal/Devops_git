package com.example.devops;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DevopsRestCon {

    @GetMapping("/")
    public String hello() {
        return "welcome";
    }
}