package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "main-service")
public interface MainInterface {
	
	@GetMapping("/get")
    public String getData();
	
	@GetMapping("/get/{id}")
    public String getData(@PathVariable int id);
	
}
