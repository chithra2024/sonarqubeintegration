package com.stackroute.sonarqube.controller;

import com.stackroute.sonarqube.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class HomeController {
    @Autowired
    private MessageServiceImpl service;

    @GetMapping("/")
    public String getMessage(){
        return service.getMessage();
    }

}
