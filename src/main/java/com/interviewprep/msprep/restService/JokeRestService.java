package com.interviewprep.msprep.restService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interviewprep.msprep.controller.JokeController;
import com.interviewprep.msprep.model.JokeObject;
import com.interviewprep.msprep.service.Shape;

@RestController
public class JokeRestService {
	@Autowired
	JokeController jokeC;

	@Autowired
	@Qualifier(value = "Circle")
	Shape s;

	@GetMapping("/")
	public JokeObject sayHi() {
		s.draw();
		return jokeC.getJoke();
	}

}
