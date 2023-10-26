package com.tcs.service.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.domain.Customer;
import com.tcs.dto.CustomerDTO;
import com.tcs.exception.IdNotFoundException;
import com.tcs.repo.CustomerRepo;
import com.tcs.service.ICustomerService;

@Service
public class ICustomerServiceImpl implements ICustomerService {

	@Autowired
	CustomerRepo customerRepo;

	@Override
	public String saveCustomer(CustomerDTO dto) {
		Customer entity = new Customer();
		BeanUtils.copyProperties(dto, entity);

		customerRepo.save(entity);

		return "success saved ...";
	}

	@Override
	public CustomerDTO getCustomerById(Integer id) {
		Optional<Customer> optional = customerRepo.findById(id);
		if (optional.isPresent()) {
			Customer customer = optional.get();
			CustomerDTO dto = new CustomerDTO();
			BeanUtils.copyProperties(customer, dto);
			return dto;
		}
		throw new IdNotFoundException("Id not found Exception  " + id);
	}

}
