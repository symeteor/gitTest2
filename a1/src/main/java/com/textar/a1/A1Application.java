package com.textar.a1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class A1Application {

	public static void main(String[] args) {
		System.out.println("This is the ��һ�� Spring MVC.");
		SpringApplication.run(A1Application.class, args);
		System.out.println("This is the ��er�� Spring MVC.");
	}

}
