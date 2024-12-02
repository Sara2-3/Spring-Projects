package com.example.sara.jstlloop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.sara.jstlloop.dto.Basket;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/user")
    public String getFruits(Model model) {
        List<Basket> fruits= new ArrayList<>();
        fruits.add(new Basket("Kiwi",1.5));
        fruits.add(new Basket("Mango",2.0));
        fruits.add(new Basket("Goji Berries",4.00));
        fruits.add(new Basket("Guava",0.75));

        model.addAttribute("vegetables", fruits);
        return "index";
    }
}
