package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerLayer {

    @GetMapping("/hello")
    public String getMethod(){
        return "Hello world!";
    }


}
