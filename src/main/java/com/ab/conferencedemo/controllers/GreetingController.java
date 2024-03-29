package com.ab.conferencedemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author Arpit Bhardwaj
 */

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting (Map<String,Object> model){
        model.put("message","Hello Arpit");
        return "greeting";
    }
}
