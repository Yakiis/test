package com.develop.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.develop.test.model.databasemodel.UserDataBaseModel;
import com.develop.test.repository.IUserRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TestApplication implements CommandLineRunner{

	@Autowired
	IUserRepository user;
	
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		UserDataBaseModel user1 = new UserDataBaseModel();
		
		user1.setId(1L);
		user1.setUserName("yovany");
		user1.setName("eduardo");
		user1.setPassword("1234qaz.");
		user1.setRol("admin");
		user1.setSexo("M");
		user1.setCorreo("yovany.perez@gmail.com");
		user.save(user1);
		
		new UserDataBaseModel();
		user1.setId((user.lastUser().getId()+1));
		user1.setUserName("jesus");
		user1.setName("enrique");
		user1.setPassword("1234qaz.");
		user1.setRol("user");
		user1.setSexo("M");
		user1.setCorreo("jesus.gonzalez@gmail.com");
		user.save(user1);
		
	}
}
