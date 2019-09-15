package com.sj.logintest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @PostMapping("login")
    public ModelAndView login(
     @RequestParam("loginName") String loginName,
     @RequestParam("password")  String password,
     ModelAndView mv){
        System.out.println("LoginController loginfangfabeidiaoyong");
        System.out.println("LogingController dengluming dengluming");
        System.out.println(loginName+"--"+password);



        mv.setViewName("redirect:/main");
        return mv;
    }
}
