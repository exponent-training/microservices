package com.iba.main.userservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iba.main.userservice.model.UserEntity;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, Long>{

}
