package com.example.sara.displaydate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller

public class DisplayDateController {

    @GetMapping("/")
    public String user() {
        return "index";
    }
    @GetMapping("/date")
    public String date(Model model) {
        String formattedDate= new SimpleDateFormat("EEEE,MMM dd, yyyy").format(new Date());
        model.addAttribute("formattedDate", formattedDate);
        return "date";
    }
    @GetMapping("/time")
    public String timePage(Model model) {
        // Format the current time
        String formattedTime = new SimpleDateFormat("hh:mm a").format(new Date());
        model.addAttribute("formattedTime", formattedTime);
        return "time";
    }
}
