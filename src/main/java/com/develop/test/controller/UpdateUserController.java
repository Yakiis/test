package com.develop.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.develop.test.model.responsemodel.UserModel;
import com.develop.test.service.IUpdateUserService;

@Controller
public class UpdateUserController implements IUpdateUserController {
	
	@Autowired
	IUpdateUserService updateservice;
	@Override
	public ResponseEntity<String>  updateuser(UserModel user) {
		 
		
		if (updateservice.update(user)) {
			return new ResponseEntity<>("Actualización correcta",HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Actualización incorrecta",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

	
}
