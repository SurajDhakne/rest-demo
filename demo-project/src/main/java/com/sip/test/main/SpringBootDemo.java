package com.sip.test.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.sipl.test"})
public class SpringBootDemo {
	public static void main(String args[]) {
		SpringApplication.run(SpringBootDemo.class, args);
	}
}
