package com.iba.main.bankdetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iba.main.userservice.model.RandonAccountNumber;

@Repository
public interface RandonAccountRepository extends JpaRepository<RandonAccountNumber, Integer>{

}
