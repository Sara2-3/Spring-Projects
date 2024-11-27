package com.example.sara.daikichiroutess.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")

public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome!";
    }

    @GetMapping("/today")
    public String hello() {
        return "Today will find luck in all your endevors";
    }

    @GetMapping("/tomorrow")
    public String hellotomorrow() {
        return "Tomorrow,an opportunity will arsie,so be sure to be open to new ideas";
    }

}
