package com.yzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( "/test")
public class TestController {

    @GetMapping("/say")
    public String sayHello(){
        System.out.println("12345");
        return "hello";
    }
}
