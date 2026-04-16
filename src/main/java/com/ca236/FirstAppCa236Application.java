package com.ca236;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@SpringBootApplication   //annotation
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class FirstAppCa236Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = SpringApplication.run(FirstAppCa236Application.class, args);
//		Arrays.stream(app.getBeanDefinitionNames()).forEach(System.out::println);
	}




}
