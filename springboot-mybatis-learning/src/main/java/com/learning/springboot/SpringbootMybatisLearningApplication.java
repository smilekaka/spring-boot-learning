package com.learning.springboot;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.learning.springboot.dao")
public class SpringbootMybatisLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisLearningApplication.class, args);
    }

}
