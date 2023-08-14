package com.iba.main.userservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iba.main.userservice.enumdata.Status;
import com.iba.main.userservice.model.LoginResponse;
import com.iba.main.userservice.model.UserEntity;
import com.iba.main.userservice.repo.UserEntityRepository;

@Service
public class UserEntityServiceImpl implements UserEntityService{

	@Autowired
	private UserEntityRepository userEntityRepository;
	
	@Override
	public void saveUserEntityData(UserEntity userEntity) {
		// TODO Auto-generated method stub
		userEntity.setStatus(Status.CREATED);
		userEntityRepository.save(userEntity);
	}

	@Override
	public UserEntity getUserEntity(Long id) {
		// TODO Auto-generated method stub
		UserEntity userEntity = userEntityRepository.findById(id).get();
		return userEntity;
	}

	@Override
	public UserEntity updateUserService(UserEntity userEntity) {
		// TODO Auto-generated method stub
		//userEntity.setStatus(Status.CREATED);
		userEntityRepository.save(userEntity);
		UserEntity userEntity1 = userEntityRepository.findById(userEntity.getUid()).get();
		return userEntity1;
	}

	@Override
	public void deleteUserEntityData(Long id) {
		// TODO Auto-generated method stub
		UserEntity userEntity = userEntityRepository.findById(id).get();
		userEntity.setStatus(Status.DISEABLED);
		userEntityRepository.save(userEntity);
	}

	@Override
	public List<String> getAllUsernames() {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		List<UserEntity> ulist = userEntityRepository.findAll();
		for (UserEntity userEntity : ulist) {
			list.add(userEntity.getUname());
		}
		return list;
	}

	@Override
	public LoginResponse getLoginData(String uname, String pass) {
		// TODO Auto-generated method stub
		LoginResponse loginResponse = new LoginResponse();
		UserEntity userEntity =  userEntityRepository.findByUnameAndPass(uname, pass);
		if(userEntity != null && userEntity.getRole() != null) {
			loginResponse.setFname(userEntity.getFname());
			loginResponse.setLname(userEntity.getLname());
			loginResponse.setEmail(userEntity.getEmail());
			loginResponse.setRolename(userEntity.getRole().getRoleName());
			//loginResponse.setStatus(userEntity.getStatus());
			return loginResponse;
		}
		return null;
	}

}
