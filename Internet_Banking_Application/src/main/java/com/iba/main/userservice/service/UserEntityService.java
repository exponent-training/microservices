package com.iba.main.userservice.service;

import java.util.List;

import com.iba.main.userservice.model.UserEntity;

public interface UserEntityService {
	
	void saveUserEntityData(UserEntity userEntity);

	UserEntity getUserEntity(Long id);
	
	UserEntity updateUserService(UserEntity userEntity);
	
	void deleteUserEntityData(Long id);
	
	List<String> getAllUsernames();
}
