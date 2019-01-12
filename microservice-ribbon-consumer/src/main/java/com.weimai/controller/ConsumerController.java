package com.weimai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/say", method = RequestMethod.GET)
	public String add() {
		return restTemplate.getForEntity("http://HELLO-SERVICE/say",
				String.class).getBody();
	}
}