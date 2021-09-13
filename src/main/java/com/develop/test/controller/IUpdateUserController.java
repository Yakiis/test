package com.develop.test.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.develop.test.model.responsemodel.UserModel;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/update")
public interface IUpdateUserController {

	@ApiOperation(value = "Actualiza un usuario en la base de datos",
		      notes = "Actualiza usuario",
		      response = ResponseEntity.class, 
		      httpMethod = "POST")
	@PostMapping(value = "/update-user", produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<String> updateuser(@RequestBody UserModel user);
	
}
