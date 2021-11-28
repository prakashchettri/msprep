package com.interviewprep.msprep.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.interviewprep.msprep.controller.Circle;
import com.interviewprep.msprep.controller.Rectangle;

@Configuration
public class Config {

	@Bean
	public Circle getCirle() {
		return new Circle();
	}

	@Bean
	public Rectangle getRectangle() {
		return new Rectangle();
	}

}
