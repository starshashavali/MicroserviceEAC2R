package com.tcs.exception;

public class DuplicateBankNameException  extends RuntimeException{
	public DuplicateBankNameException(String msg) {
		super(msg);
	}

}
