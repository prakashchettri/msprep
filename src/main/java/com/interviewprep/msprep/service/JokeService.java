package com.interviewprep.msprep.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.interviewprep.msprep.model.JokeObject;

@FeignClient(name = "jokes", url = "https://v2.jokeapi.dev")
public interface JokeService {

	@GetMapping("/joke/Any")
	JokeObject getJoke();
}
