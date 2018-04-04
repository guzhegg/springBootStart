package com.guz.springBootStart.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by guz on 2018/3/30.
 */
@RestController
public class HelloWorldController {

    @Value("${arg.value}")
    private String arg;

    @RequestMapping("/helloworld")
    public String index(){
        return "hello world !!!"+arg;
    }
}
