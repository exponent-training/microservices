package com.iba.main.bankdetails.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iba.main.userservice.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

	@Query(value = "select roleName from role",nativeQuery = true)
	List<String> getAllRole();
	
	Role findByRoleName(String rolename);
	
}
