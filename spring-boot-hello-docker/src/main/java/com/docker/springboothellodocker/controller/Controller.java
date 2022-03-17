package com.docker.springboothellodocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String getMessage() {
        return "Hello Message from docker";
    }
}
