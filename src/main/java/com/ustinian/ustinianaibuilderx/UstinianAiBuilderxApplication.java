package com.ustinian.ustinianaibuilderx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ustinian.ustinianaibuilderx.mapper")
public class UstinianAiBuilderxApplication {

    public static void main(String[] args) {
        SpringApplication.run(UstinianAiBuilderxApplication.class, args);
    }

}
