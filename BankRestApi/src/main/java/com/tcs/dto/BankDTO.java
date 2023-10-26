package com.tcs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankDTO {
	
	private Integer  bankId;
	
	private String bankName;
	
	private String bankIfscCode;
	
	private String  bankAddress;

}
