package com.sri.main;

import com.sri.bean.Vehicle;
import com.sri.config.ProjectConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Example3Application {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle bmw = context.getBean("BMW X6",Vehicle.class);
        System.out.println(bmw.getName());

        Vehicle porsche = context.getBean(Vehicle.class);
        System.out.println(porsche.getName());

    }

}