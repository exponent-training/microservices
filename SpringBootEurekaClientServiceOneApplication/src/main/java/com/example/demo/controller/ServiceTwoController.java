package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceTwoController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/consumeData")
	public String getConsumedDta() {
		String str = restTemplate.getForObject("http://localhost:9009/serviceone/getData", String.class);
		System.out.println(str);
		return str;	
	}
	
}
