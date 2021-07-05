package com.smxy.campus_recruit;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.smxy.campus_recruit.mapper")
public class CampusRecruitApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusRecruitApplication.class, args);
    }

}
