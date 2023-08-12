package com.iba.main.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iba.main.bankdetails.repo.RoleRepository;
import com.iba.main.userservice.model.Role;
import com.iba.main.userservice.model.UserEntity;
import com.iba.main.userservice.repo.UserEntityRepository;

@Service
public class AdminServiceimpl implements AdminService{

	@Autowired
	private  UserEntityRepository userEntityRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public void assignedRoleToUser(String uname, String rolename) {
		// TODO Auto-generated method stub
		UserEntity userEntity = userEntityRepository.findByUname(uname);
		Role role = roleRepository.findByRoleName(rolename);
		userEntity.setRole(role);
		
		userEntityRepository.save(userEntity);
	}

}
