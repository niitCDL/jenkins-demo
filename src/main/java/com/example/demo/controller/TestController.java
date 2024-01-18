package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lenovo
 * @program : demo
 * @description :
 * @create : 2024-01-17 14:17
 **/
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "hello jenkins!!!";
    }

    @GetMapping("/test2")
    public String test2(){
        return "hello jenkins!!!";
    }

    @GetMapping("/test3")
    public String test3(){
        return "hello jenkins3333!!!";
    }
}
