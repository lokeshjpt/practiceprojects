package com.example.springrestexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter; 

@SpringBootApplication
public class SpringRestExampleApplication extends WebMvcConfigurerAdapter{

	@Autowired
	RequestInterceptor requestInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestInterceptor);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringRestExampleApplication.class, args);
	}
}
