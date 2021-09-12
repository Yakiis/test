package com.develop.test.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.develop.test.model.UserModelRersponse;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/read")
public interface IReadUserController {

	@ApiOperation(value    = "consulta los datos del usuario",
			      notes    = "En este método se consultan todos los usuarios", 
			      response = ResponseEntity.class, httpMethod = "GET")
	@GetMapping(  value    ="/all",produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody
	public ResponseEntity<UserModelRersponse> readAllUser();
	
	@RequestMapping(value= "/read-by/{id}")
	public ResponseEntity<?>readbyid(@PathVariable String id);

}
