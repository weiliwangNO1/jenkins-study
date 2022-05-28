package com.wang.action.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

    public static void main(String[] args) {
        System.out.println("服务启动");
        SpringApplication.run(StudyApplication.class, args);
    }

}
