package com.develop.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.develop.test.model.UserModelRersponse;
import com.develop.test.model.databasemodel.UserDataBaseModel;
import com.develop.test.repository.IUserRepository;

@Service
public class ReadUserService implements IReadUserService {
	
	@Autowired
	IUserRepository userRepository;
	
	public UserModelRersponse readAllUser() {
		UserModelRersponse user = new UserModelRersponse();
		List<UserDataBaseModel> userList = new ArrayList<>();
		userRepository.findAll().forEach(userList::add);
		user.setUserDb(userList);
		return user;
	}

}
