package com.example.sara.hellohuman.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController

public class HomeController {
//pyetje si te bejme foton e pare detyra 1
@GetMapping("/user")
public String home(@RequestParam String name, @RequestParam String lastname, @RequestParam int times) {
    // Create an array of the specified size
    ArrayList<String> users = new ArrayList<String>(times);

    // Populate the array with greetings
    for (int i = 0; i < times; i++) {
        String emri = "Hello " + name + " " + lastname;
        users.add(emri);
    }

    // Return the array
    return String.join(", ", users);
}
}
