package com.colak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/service1")
public class Service1Controller {

    // http://localhost:8080/api/service1/hello
    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello Service1";
    }
}
