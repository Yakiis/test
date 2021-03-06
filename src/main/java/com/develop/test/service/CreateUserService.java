package com.develop.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.develop.test.model.databasemodel.UserDataBaseModel;
import com.develop.test.model.responsemodel.UserModel;
import com.develop.test.repository.IUserRepository;

@Service
public class CreateUserService implements ICreateUserService {

	@Autowired
	IUserRepository userRepository;
	
	@Override
	public boolean createUser(UserModel user) {
		boolean response;
		Long id =userRepository.lastUser().getId()+1;
		UserDataBaseModel userDb =new UserDataBaseModel(user, id);
		if(userRepository.save(userDb) != null) {
			response = true;
			
		}else {
			response = false;
		}
		return response;
	}
}
