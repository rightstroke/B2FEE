package com.org.app.myfirstrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.org.app")
public class MyfirstrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstrestapiApplication.class, args);
	}

}
