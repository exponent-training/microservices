package com.iba.main.bankdetails.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iba.main.userservice.model.BankDetails;

@Repository
public interface BankDetailsRepository extends JpaRepository<BankDetails, Long>{

	BankDetails findByBnameAndBranchcode(String bname,String bcode);
}
