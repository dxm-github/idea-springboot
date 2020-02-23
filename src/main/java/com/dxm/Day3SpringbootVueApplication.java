package com.dxm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dxm.dao")
public class Day3SpringbootVueApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day3SpringbootVueApplication.class, args);
    }

}
