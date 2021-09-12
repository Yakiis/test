package com.develop.test.model;

import java.io.Serializable;
import java.util.List;

import com.develop.test.model.databasemodel.UserDataBaseModel;

public class UserModelRersponse implements Serializable{

	private static final long serialVersionUID = 6374452559178664257L;
	
	List<UserDataBaseModel> userDb;

	public List<UserDataBaseModel> getUserDb() {
		return userDb;
	}

	public void setUserDb(List<UserDataBaseModel> userDb) {
		this.userDb = userDb;
	}

	
}
