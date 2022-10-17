package com.codedecode.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CodeDecodeCrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(CodeDecodeCrudApplication.class, args);
		System.out.println(applicationContext.getBean("employee"));
	}

}
