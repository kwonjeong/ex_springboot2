package com.example.ex_springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // annotation으로 스프링부트의 설정값 자동 설정, 프로젝트 최상단
public class Application {
    public static void main(String[] args){ // main class
        SpringApplication.run(Application.class, args); // 내장 WAS 실행
    }
}
