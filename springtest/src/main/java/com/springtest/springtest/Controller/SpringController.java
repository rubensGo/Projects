package com.springtest.springtest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
    
    @GetMapping("/")
    public String index() {
        return "Hello World";
    }
}
