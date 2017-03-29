package com.springboot.dubbox.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbox.xml"})
public class DubboxSpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboxSpringbootDemoApplication.class, args);
	}
}
