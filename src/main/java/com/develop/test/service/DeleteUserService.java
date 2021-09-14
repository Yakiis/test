package com.develop.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.develop.test.repository.IUserRepository;

@Service
public class DeleteUserService implements IDeleteUserService {

	@Autowired
	IUserRepository userRepository;

	@Override
	public boolean deleteUserById(String id) {
		boolean response;

		if (userRepository.deleteUserById(id) == 1) {
			response = true;
		} else {
			response = false;
		}

		return response;

	}

}
