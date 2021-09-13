package com.develop.test.service;

import org.springframework.stereotype.Service;

import com.develop.test.model.responsemodel.UserModel;


public interface IUpdateUserService {

	boolean update(UserModel user);
	
	
}
