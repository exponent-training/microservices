package com.iba.main.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iba.main.userservice.model.UserEntity;
import com.iba.main.userservice.service.UserEntityService;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserEntityController {
	
	@Autowired
	private UserEntityService userEntityService;
	
	@RequestMapping(value = "/save")
	public ResponseEntity<String> saveUserEntity(@RequestBody UserEntity userEntity) {
		userEntityService.saveUserEntityData(userEntity);
		return ResponseEntity.ok("User Entty Created Successfully.");
	}

}
