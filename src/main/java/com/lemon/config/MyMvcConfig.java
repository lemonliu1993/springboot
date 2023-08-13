package com.lemon.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by lemoon on 2023/8/13 10:36
 */
//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能

//@EnableWebMvc
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        super.addViewControllers(registry);
        //浏览器发送/lemon 请求来到success页面
        registry.addViewController("/lemon").setViewName("success");
    }
}
