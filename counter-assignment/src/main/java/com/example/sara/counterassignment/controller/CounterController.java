package com.example.sara.counterassignment.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CounterController {

    @GetMapping("/")
    public String index() {
        return "page1";
    }
    @GetMapping("/counter")
    public String counter(HttpSession session) {

        if(session.getAttribute("numerues") == null) {
            session.setAttribute("numerues", 0);
        }
        else{
            Integer i = ((Integer)session.getAttribute("numerues"));
            session.setAttribute("numerues", i+1);
        }
        return "index";

    }
    //Ninja Bonus 2: Create a reset button to set the counter back to zero.
    @PostMapping("/resetCounter")
    public String resetController(HttpSession session) {
        session.setAttribute("numerues", 0);
        return "redirect:/counter";
    }




    //Ninja bonus also added to reset at zero when the number reach at 12 so the conditonal have not to go till infinit
    @GetMapping("/countertwo")
    public String countertwo(HttpSession session) {

        if (session.getAttribute("rritjemedy") == null) {
            session.setAttribute("rritjemedy", 0);
        } else {
            Integer y = ((Integer) session.getAttribute("rritjemedy")) + 2;
            session.setAttribute("rritjemedy", y);
            if(y>=12){
                y=0;
            }
            session.setAttribute("rritjemedy", y);
        }
        return "ninjaone";
    }
}
