package com.college.card;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.college.card.mapper")
public class CollegeCardApplication {

    public static void main(String[] args) {
        SpringApplication.run(CollegeCardApplication.class, args);
    }

}
