package com.jgyj.ssm.controller;

import com.jgyj.ssm.service.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerA {
    @Autowired
    private ServiceA serviceA;

    @GetMapping("/testA")
    public String testContollerA() {
        return serviceA.testA();
    }
}