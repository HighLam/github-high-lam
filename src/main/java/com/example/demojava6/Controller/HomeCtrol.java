package com.example.demojava6.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeCtrol {

    @GetMapping("/home")
    public String home() {
        return "Hello";
    }
}
