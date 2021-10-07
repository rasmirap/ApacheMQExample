package com.home.apacheMQEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ApacheMqExApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheMqExApplication.class, args);
	}

}
