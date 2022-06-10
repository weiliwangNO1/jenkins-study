package com.wang.action.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class StuController {

    @GetMapping(value = "/name")
    public String name(String name) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "hello " + name + "，访问时间：" + sdf.format(new Date()) ;

    }


    @GetMapping(value = "/teacher")
    public String teacher(String name) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "hello " + name + "，访问时间：" + sdf.format(new Date());
    }


    @GetMapping(value = "/student")
    public String student() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "hello world!!!，访问时间：" + sdf.format(new Date()) ;

    }

    @GetMapping(value = "/test")
    public String test() {
        return "hello world!!!";
    }

}
