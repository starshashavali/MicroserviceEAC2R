package com.tcs.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.domain.Bank;
import com.tcs.dto.BankDTO;
import com.tcs.exception.DuplicateBankNameException;
import com.tcs.exception.IdNotFoundException;
import com.tcs.repo.BankRepo;
import com.tcs.service.IBankService;

@Service
public class IBankServiceImpl implements IBankService {

	@Autowired
	private BankRepo bankRepo;
	
	@Override
	public String saveBank(BankDTO bankDto) {
		Bank name = bankRepo.findByBankName(bankDto.getBankName());
		if(name!=null) {
			throw new DuplicateBankNameException("Duplicate bank name...");
		}
		Bank entity =new Bank();
		BeanUtils.copyProperties(bankDto, entity);
		bankRepo.save(entity);
		
		return "successfully saved...";
	}

	@Override
	public BankDTO getByBankId(Integer id) {
		Optional<Bank> optional = bankRepo.findById(id);
		if(optional.isPresent()) {
			Bank bank = optional.get();
			BankDTO dto=new BankDTO();
			BeanUtils.copyProperties(bank, dto);
			return dto;
		}
		throw new IdNotFoundException("Id not found Exception..."+id);
	}

}
