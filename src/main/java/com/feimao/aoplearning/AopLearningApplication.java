package com.feimao.aoplearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopLearningApplication.class, args);
	}
}
