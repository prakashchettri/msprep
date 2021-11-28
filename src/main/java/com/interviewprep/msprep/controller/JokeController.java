package com.interviewprep.msprep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.interviewprep.msprep.model.JokeObject;
import com.interviewprep.msprep.service.JokeService;

@Controller
public class JokeController {
	@Autowired
	private JokeService jService;

	// private RestTemplate restTemplate;

	public JokeObject getJoke() {
		return jService.getJoke();
		// return restTemplate.getForObject("https://v2.jokeapi.dev/joke/Any",
		// JokeObject.class);
	}
}
