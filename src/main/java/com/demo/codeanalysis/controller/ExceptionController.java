package com.demo.codeanalysis.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.codeanalysis.cofig.CustomException;

@RestController
public class ExceptionController {
	
	@GetMapping("/")
	public ResponseEntity<String> welcome() {
		return new ResponseEntity<>("Static Code Analysis demo!", HttpStatus.OK);
	}
	
	@GetMapping("/ex")
	public ResponseEntity<String> excep() throws CustomException {
		throw new CustomException("My Custom Exception");
	}

}
