package com.example.childrenprogramme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ChildrenProgrammeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChildrenProgrammeApplication.class, args);
    }

}
