package com.itvdn.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages")
public class PagesController {



    @GetMapping("/1")
    public String firstPage(){
        return "pages/1";

    }@GetMapping("/2")
    public String secondPage(){
        return "pages/2";

    }@GetMapping("/3")
    public String thirdPage(){
        return "pages/3";
    }

/*    @GetMapping("/exit")
    public String exitPages(){
        return "pages/exit";
    }*/
}
