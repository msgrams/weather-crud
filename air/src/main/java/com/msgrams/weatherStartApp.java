package com.msgrams;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Auther: LiZhi
 * @Date: 2024/7/4 - 9:23
 * @Description: com.msgrams
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan(basePackages = "com.msgrams.mapper")
@EnableSwagger2
public class weatherStartApp {
    public static void main(String[] args) {
        SpringApplication.run(weatherStartApp.class,args);
    }
}
