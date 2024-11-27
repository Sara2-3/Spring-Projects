package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")

public class HomeController {

    @GetMapping("/travel/{name}")
    public String user(@PathVariable String name) {
        return "Congratulations! You will soon travel to " + name + "! ";
    }

    @GetMapping("/lotto/{id}")
    public String home(@PathVariable int id) {
        if (id % 2 == 0) {
            return "You will take a grand journey in the near future,but be wary of temping offers ";
        }
        else {
            return "You have enjoyed the fruits of you labor but now is a great time to spend time with family and friends ";
        }
    }
}
