package com.develop.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.develop.test.model.responsemodel.UserModel;
import com.develop.test.service.CreateUserService;

@Controller
public class CreateUserController implements ICreateUserController{
	
	@Autowired
	CreateUserService createUserService;

	@Override
	public ResponseEntity<String> createUSer(UserModel user) {
		if(createUserService.createUser(user)) {
			return new ResponseEntity<>("se creo exitosamente el usuario",HttpStatus.OK);
		}else {
			return new ResponseEntity<>("ha ocurrido un error",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
