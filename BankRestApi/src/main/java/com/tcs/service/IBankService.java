package com.tcs.service;

import com.tcs.dto.BankDTO;

public interface IBankService {

	public String saveBank(BankDTO bankDto);

	public BankDTO getByBankId(Integer id);

}
