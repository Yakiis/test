package com.develop.test.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.develop.test.model.responsemodel.UserModel;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(value="http://localhost:4200/")
@RestController
@RequestMapping("/create")
public interface ICreateUserController {

	@ApiOperation(value = "Agrega un nuevo usuario a la base de datos",
			      notes = "nuevo usuario",
			      response = ResponseEntity.class, 
			      httpMethod = "POST")
	@PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<String> createUSer(@RequestBody UserModel user);

}
