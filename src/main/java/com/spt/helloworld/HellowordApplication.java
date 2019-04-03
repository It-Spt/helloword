package com.spt.helloworld;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = {"com.spt.helloworld.dao.mapper"})
public class HellowordApplication {
    public static void main(String[] args) {
        SpringApplication.run(HellowordApplication.class, args);
    }

}
