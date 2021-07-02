package com.itvdn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {

        // System.out.println("Hello, " + name + " " + surname);
        model.addAttribute("message", "Hello, " + name + " " + surname);

        return "first/hello";
    }
    @GetMapping("/exit")
    public String exitPage() {
        System.out.println("Exit");

        return "first/exit";
    }

    @GetMapping("/calculator")
    public String calculate(@RequestParam(value = "a", required = false) double a,
                            @RequestParam(value = "b", required = false) double b,
                            @RequestParam(value = "action", required = false) String action,
                            Model model) {

        // System.out.println("Hello, " + name + " " + surname);
        double result;
         switch (action){
             case "mult": {
                 result = a * b;
                 break;
             }
             case "div": {
                 result = a / b;
                 break;
             }
             default: {
                 result = -1;
                 break;
             }
        }

        model.addAttribute("calcResult", "Result, " + result);

        return "first/calculator";
    }
}
