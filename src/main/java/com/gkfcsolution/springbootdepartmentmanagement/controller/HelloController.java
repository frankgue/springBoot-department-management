package com.gkfcsolution.springbootdepartmentmanagement.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2025 at 22:11
 * File: null.java
 * Project: springBoot-department-management
 *
 * @author Frank GUEKENG
 * @date 03/10/2025
 * @time 22:11
 */
@RestController
public class HelloController {
    @Value("${welcome.message}")
    private String welcomeMessage;
    @GetMapping(value = "/")
    public String helloWorld(){
        return welcomeMessage;
    }
}
