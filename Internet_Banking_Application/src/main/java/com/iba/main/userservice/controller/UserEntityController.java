package com.iba.main.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping(value = "/get/{id}")
	public ResponseEntity<UserEntity> getUserEntity(@PathVariable Long id){
		UserEntity userEntity = userEntityService.getUserEntity(id);
		return ResponseEntity.ok(userEntity);
	}

	@PutMapping(value = "/update")
	public ResponseEntity<UserEntity> getUpdattedUserEntity(@RequestBody UserEntity userEntity){
		UserEntity userEntity2 = userEntityService.updateUserService(userEntity);	
		return ResponseEntity.ok(userEntity2);
	}
	
	@DeleteMapping(value = "/del/{id}")
	public ResponseEntity<String> getDeletedEntity(@PathVariable Long id){
		userEntityService.deleteUserEntityData(id);
		return ResponseEntity.ok("Your Service is Blocked.");
	}

}
	
