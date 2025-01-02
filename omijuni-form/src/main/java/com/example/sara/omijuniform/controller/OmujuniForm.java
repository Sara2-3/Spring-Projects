package com.example.sara.omijuniform.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmujuniForm {

    @GetMapping("/omikunji")
    public String omikunji() {
        return "index";
    }
    @PostMapping("/show")
    public String show(@RequestParam Integer number,
                       @RequestParam String city,@RequestParam String person,
                       @RequestParam String hobby,@RequestParam String living,
                       @RequestParam String comment, HttpSession session) {
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("hobby", hobby);
        session.setAttribute("living", living);
        session.setAttribute("comment", comment);
        return "redirect:/home";
    }

    @PostMapping("/home")
    public String home() {
        return "welcome";
    }

}
