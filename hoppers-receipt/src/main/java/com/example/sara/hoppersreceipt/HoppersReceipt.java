package com.example.sara.hoppersreceipt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller

public class HoppersReceipt {
    @GetMapping("/")
    public String hoppersReceipt(@RequestParam String name, @RequestParam String surname, @RequestParam String itemName,
                                 @RequestParam double price,@RequestParam String description,@RequestParam String vendor,Model model) {
        model.addAttribute("name", name);
        model.addAttribute("surname", surname);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);
        return "index";
    }

}
