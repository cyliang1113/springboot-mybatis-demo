package com.leo.springbootmybatisdemo;

import com.sun.org.apache.bcel.internal.generic.IFNONNULL;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.leo.springbootmybatisdemo.mapper")
public class SpringbootMybatisDemoApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDemoApp.class, args);
    }
}
