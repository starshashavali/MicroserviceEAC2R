package com.tcs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.domain.Bank;

public interface BankRepo extends JpaRepository<Bank,Integer>{
	
	Bank findByBankName(String bankName);

}
