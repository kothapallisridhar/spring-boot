package com.sri.config;

import com.sri.bean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean("BMW X6")
    Vehicle vehicle1() {
        var car = new Vehicle();
        car.setName("BMW X6");
        return car;
    }

    @Bean(name="Mercedes AMG Coupe")
    Vehicle vehicle2() {
        var car = new Vehicle();
        car.setName("Mercedes AMG Coupe");
        return car;
    }

    @Primary
    @Bean(value="Porsche Cayanne Coupe")
    Vehicle vehicle3() {
        var car = new Vehicle();
        car.setName("Porsche Cayanne Coupe");
        return car;
    }
}
