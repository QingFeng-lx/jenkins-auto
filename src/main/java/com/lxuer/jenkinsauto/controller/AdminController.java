package com.lxuer.jenkinsauto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/admin")
@RestController
public class AdminController {
    @RequestMapping("/hello")
    public String sayHello(){
        return "你好 Jenkins 嘎嘎110250";
    }
}
