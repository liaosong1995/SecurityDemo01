package com.liaosong.security.controller;

import com.liaosong.security.resp.RespBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class LoginController {
    @GetMapping("/login")
    public RespBean login() {
        return RespBean.error("尚未登录，请登录");
    }
    @GetMapping("/hello1")
    public String hello() {
        return "hello1";
    }
}