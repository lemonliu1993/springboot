package com.lemon.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lemoon on 2023/7/7 23:43
 */

@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello" + name;
    }


    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}

