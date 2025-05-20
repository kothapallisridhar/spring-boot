package com.sri.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		//ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		//orderService.setPaymentService(new PaypalPaymentService());
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();

		NotificationManager notificationManager = context.getBean(NotificationManager.class);
		notificationManager.sendNotification("using Spring Boot");

		var resource = context.getBean(HeavyResource.class);
		context.close();
	}

}
