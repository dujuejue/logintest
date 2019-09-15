package com.sj.logintest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLOutput;

@Controller
public class MainController {
    @RequestMapping(value="/main")
    public String main(){
        System.out.println("MainAction main fangfa");
        return "main";
    }
}
