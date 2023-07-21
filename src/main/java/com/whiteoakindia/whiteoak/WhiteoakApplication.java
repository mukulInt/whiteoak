package com.whiteoakindia.whiteoak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:constant/constant.properties")
public class WhiteoakApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(WhiteoakApplication.class, args);
	}

}
