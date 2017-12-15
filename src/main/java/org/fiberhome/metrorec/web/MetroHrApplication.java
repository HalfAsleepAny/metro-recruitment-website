package org.fiberhome.metrorec.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
//@EnableAutoConfiguration    //这个注解可以根据你依赖的包自动生成相关配置
//@ComponentScan 
public class MetroHrApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MetroHrApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MetroHrApplication.class);
    }
}
