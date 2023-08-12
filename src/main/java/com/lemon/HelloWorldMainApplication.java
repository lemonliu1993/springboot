package com.lemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * Created by lemoon on 2023/7/7 23:33
 */
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {

        //Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }


    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }

    private static class MyViewResolver implements ViewResolver{
        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
}
