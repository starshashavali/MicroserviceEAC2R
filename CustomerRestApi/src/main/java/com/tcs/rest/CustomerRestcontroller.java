package com.tcs.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.dto.CustomerDTO;
import com.tcs.service.ICustomerService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/customer")
@Valid
public class CustomerRestcontroller {
	
	@Autowired
	private ICustomerService customerService;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveCustomer(@RequestBody CustomerDTO dto){
		String saveCustomer = customerService.saveCustomer(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(saveCustomer);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getCustomerById(@PathVariable Integer id){
		CustomerDTO dto = customerService.getCustomerById(id);
		return ResponseEntity.status(HttpStatus.OK).body(dto);
	}
	

}