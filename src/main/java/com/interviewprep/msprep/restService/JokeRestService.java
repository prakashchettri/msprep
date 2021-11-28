package com.interviewprep.msprep.restService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.interviewprep.msprep.controller.JokeController;
import com.interviewprep.msprep.model.JokeObject;

@RestController
public class JokeRestService {
	@Autowired
	JokeController jokeC;

	@GetMapping("/")
	public JokeObject sayHi() {
		return jokeC.getJoke();
	}

}
