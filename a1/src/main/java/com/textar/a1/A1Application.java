package com.textar.a1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class A1Application {

	public static void main(String[] args) {
		System.out.println("This is the 第一个 Spring MVC.");
		SpringApplication.run(A1Application.class, args);
		System.out.println("This is the 第er个 Spring MVC.");
	}

}
