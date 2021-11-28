package com.interviewprep.msprep.controller;

import org.springframework.stereotype.Component;

import com.interviewprep.msprep.service.Shape;

@Component(value = "Rectangle")
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing: " + this.getClass().getName());

	}

}
