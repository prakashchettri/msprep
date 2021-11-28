package com.interviewprep.msprep.controller;

import org.springframework.stereotype.Component;

import com.interviewprep.msprep.service.Shape;

@Component(value = "Circle")
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing: " + this.getClass().getName());

	}

}
