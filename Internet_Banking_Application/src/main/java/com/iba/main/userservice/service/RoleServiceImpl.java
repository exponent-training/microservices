package com.iba.main.userservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iba.main.bankdetails.repo.RoleRepository;
import com.iba.main.userservice.model.Role;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public List<String> getRoleList() {
		// TODO Auto-generated method stub
		List<String> roleList = new ArrayList<String>();
		List<Role> rlist = roleRepository.findAll();
		System.out.println(rlist);
		for(Role role : rlist) {
			roleList.add(role.getRoleName());
		}
		return roleList;
	}

}
