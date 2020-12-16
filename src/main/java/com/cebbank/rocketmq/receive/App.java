package com.cebbank.rocketmq.receive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cebbank.rocketmq.receive.aopDemo.AopDemo;
import com.cebbank.rocketmq.receive.aopDemo.MathCalculator;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class App {
	public static void main(String[] args) {
//		SpringApplication.run(App.class, args);
		ApplicationContext application = new AnnotationConfigApplicationContext(AopDemo.class);
		MathCalculator mathCalculator = application.getBean(MathCalculator.class);
		mathCalculator.div(1, 1);
	}
}
