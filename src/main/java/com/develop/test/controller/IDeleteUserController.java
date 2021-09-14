package com.develop.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(value="http://localhost:4200/")
@RestController
@RequestMapping("/delete")
public interface IDeleteUserController {
	
	
	@ApiOperation(value      = "Elimina a un usuario",
		          notes      = "En este método elimina al usuario por ID", 
		          response   = ResponseEntity.class, 
		          httpMethod = "PUT")
	@PutMapping(value ="/by/{id}")
	public ResponseEntity<String> deleteById (@PathVariable String id);
	
}
