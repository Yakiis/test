package com.develop.test.service;

import org.springframework.stereotype.Service;

import com.develop.test.model.UserModelRersponse;

@Service
public interface IReadUserService {
	
	UserModelRersponse readAllUser();

}
