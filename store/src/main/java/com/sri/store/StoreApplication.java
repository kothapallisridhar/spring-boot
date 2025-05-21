package com.sri.store;

import com.sri.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		//ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);

	}

}
