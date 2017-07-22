package com.dongfangyuxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.dongfangyuxin")
@ServletComponentScan
public class SagittariusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SagittariusApplication.class, args);
    }
}
