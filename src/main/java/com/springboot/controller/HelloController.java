package com.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *  Restful 风格
 */
@RestController //以 json 响应数据，无需配置， jackson
//@Controller
public class HelloController {
    @RequestMapping("hellospringboot")
    public String hello(){
        return "hello spring boot";
    }


}
