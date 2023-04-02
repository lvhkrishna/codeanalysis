package com.demo.codeanalysis.cofig;

public class CustomException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public CustomException(String msg) {
		super(msg, null, false, false);
	}

}
