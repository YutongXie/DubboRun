package com.zhe.qiushui.DubboRun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource(value = {"classpath:provider.xml"})
public class DubboRunApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboRunApplication.class, args);
    }

}
