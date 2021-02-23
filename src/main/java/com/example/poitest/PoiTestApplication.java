package com.example.poitest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.poitest.dao")
public class PoiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoiTestApplication.class, args);
    }

}
