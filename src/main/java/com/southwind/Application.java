package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication      //这个注解证明这个是springboot的启动类
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
