package com.tcs.service;

import com.tcs.dto.CustomerDTO;

public interface ICustomerService {
	
	
	public String saveCustomer(CustomerDTO dto);
	
	public CustomerDTO getCustomerById(Integer id);
	
	
	

}
