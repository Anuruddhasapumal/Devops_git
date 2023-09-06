package com.example.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsRestCon {
    @GetMapping("/welcome")
    public String welcome(){

        return "welcome to devops";
    }
}
