package com.interviewprep.msprep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
@EnableFeignClients
public class MsprepApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsprepApplication.class, args);
	}

	@Bean
	public RestTemplate resttemplate() {

		return new RestTemplate();
	}

}
