package com.wang.action.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class StuController {

    @GetMapping(value = "/name")
    public String name(@RequestParam(value = "姓名", name = "name", required = false) String name) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "hello " + name + "，访问时间：" + sdf.format(new Date()) ;

    }

}
