package com.codewith.firstApp.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class OrderController {
    @GetMapping("/order")
    public String getMethodName(@RequestParam String item) {
        return new String("Your Order for item"+item+ "is recieved.");
    }
    
    
}
