package com.example.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(FirstprojectApplication.class, args);// run return object of configurable application context
		System.out.println("welcome boot............");
		Coder coder=context.getBean(Coder.class);
		coder.show();

	}

}
