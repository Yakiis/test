package com.develop.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.develop.test.model.UserModelRersponse;
import com.develop.test.service.IReadUserService;

@Controller
public class ReadUserController implements IReadUserController{

	@Autowired
	IReadUserService readUserService;
	
	
	@Override
	public ResponseEntity<UserModelRersponse> readAllUser() {
		
		return new ResponseEntity<>(readUserService.readAllUser(),HttpStatus.OK);
	}


	@Override
	public ResponseEntity<?> readbyid(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
