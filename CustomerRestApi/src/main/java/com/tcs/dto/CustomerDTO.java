package com.tcs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
	
	private Integer customerId;
	
	private String customerName;
	
	private Long  customerAccountNo;
	
	private String customerBank;
	
	

}
