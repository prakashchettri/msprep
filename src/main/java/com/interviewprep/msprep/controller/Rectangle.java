package com.interviewprep.msprep.controller;

import com.interviewprep.msprep.service.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing: " + this.getClass().getName());

	}

}
