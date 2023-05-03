package com.sau.sbt.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getIndex(){
        return "Hello CI-CD";
    }
}
