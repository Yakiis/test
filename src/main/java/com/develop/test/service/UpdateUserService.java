package com.develop.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.develop.test.model.responsemodel.UserModel;
import com.develop.test.repository.IUserRepository;

@Service
public class UpdateUserService implements IUpdateUserService {

	@Autowired
	IUserRepository repository;
	
	@Override
	public boolean update(UserModel user) {
		boolean response;
		if(repository.updateuser(user.getCorreo(), user.getPassword(), user.getRol(), user.getSexo(), user.getUserName(), user.getId())==1) {
			response = true;
		} else {
			response = false;
		}
		return response;
	}

	
	
}
