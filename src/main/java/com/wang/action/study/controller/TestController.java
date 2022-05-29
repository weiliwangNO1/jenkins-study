package com.wang.action.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class TestController {

    @GetMapping(value = "hello")
    public String hello(@RequestParam(value = "参数", name = "param", required = false) String param) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "hello " + param + "     " + sdf.format(new Date());
    }

}
