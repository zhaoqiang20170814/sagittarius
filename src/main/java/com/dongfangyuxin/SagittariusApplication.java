package com.dongfangyuxin;

import com.dongfangyuxin.common.util.DataDicCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.dongfangyuxin")
@ServletComponentScan
public class SagittariusApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SagittariusApplication.class, args);
        // 载入字典项缓存
        applicationContext.getBean(DataDicCache.class).init();
    }
}
