package com.develop.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import com.develop.test.service.IDeleteUserService;

@Controller
public class DeleteUserController implements IDeleteUserController {

	@Autowired
	IDeleteUserService deleteUserService;

	@Override
	public ResponseEntity<String> deleteById(String id) {
		
		if(deleteUserService.deleteUserById(id)) {
			return new ResponseEntity<>("Eliminación Correcta",HttpStatus.OK);
		}else {
			return new ResponseEntity<>("Eliminación Incorrecta",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
