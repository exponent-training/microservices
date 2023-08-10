package com.iba.main.userservice.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iba.main.bankdetails.repo.BankDetailsRepository;
import com.iba.main.bankdetails.repo.RandonAccountRepository;
import com.iba.main.userservice.enumdata.AccountStatus;
import com.iba.main.userservice.enumdata.AccountType;
import com.iba.main.userservice.model.AccountDetails;
import com.iba.main.userservice.model.AccountRequest;
import com.iba.main.userservice.model.BankDetails;
import com.iba.main.userservice.model.RandonAccountNumber;
import com.iba.main.userservice.model.UserEntity;
import com.iba.main.userservice.repo.AccountDetailsRepository;
import com.iba.main.userservice.repo.UserEntityRepository;

@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	private RandonAccountRepository randonAccountRepository;

	@Autowired
	private BankDetailsRepository bankDetailsRepository;
	
	@Autowired
	private UserEntityRepository userEntityRepository;
	
	@Autowired
	private AccountDetailsRepository accountDetailsRepository;
	
	@Override
	public void createAccount(AccountRequest accountRequest) {
		// TODO Auto-generated method stub
		AccountDetails accountDetails = new AccountDetails();
		
		RandonAccountNumber randonAccountNumber = randonAccountRepository.findById(1).get();
		System.out.println("Random Account Number : " + randonAccountNumber);
		
		String acc = accountRequest.getAccountnumber();
		acc = acc+randonAccountNumber.getAccontNumber();
		accountRequest.setAccountnumber(acc);
		System.out.println(accountRequest);
		randonAccountNumber.setAccontNumber(randonAccountNumber.getAccontNumber()+1);
		
		BankDetails bankDetails = bankDetailsRepository.findByBnameAndBranchcode(accountRequest.getBankname(), accountRequest.getBankcode());
		UserEntity userEntity = userEntityRepository.findByUname(accountRequest.getUname());
		
		accountDetails.setAccountnumber(accountRequest.getAccountnumber());
		accountDetails.setAccstatus(AccountStatus.values()[accountRequest.getAccstatus()]);
		accountDetails.setAcctype(AccountType.values()[accountRequest.getAcctype()]);
		accountDetails.setAmount(accountRequest.getAmount());
		accountDetails.setActualBalance(accountRequest.getAmount());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String strDate = dateFormat.format(new Date());
		accountDetails.setCreatedDate(strDate);
		accountDetails.setUser(userEntity);
		accountDetails.setBankDetails(bankDetails);
		
		randonAccountRepository.save(randonAccountNumber);
		accountDetailsRepository.save(accountDetails);
		
	}
	
	 

}
