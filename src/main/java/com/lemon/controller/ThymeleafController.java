package com.lemon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lemoon on 2023/8/8 17:44
 */
@Controller
public class ThymeleafController {


    @RequestMapping("/success")
    public String success() {
        //classpath:/templates/success.html
        return "test";
    }
}
