package com.javatechie.spring.ws.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/list")
    public String getList(){
        return "list";
    }
}
