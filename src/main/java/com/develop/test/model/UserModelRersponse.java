package com.develop.test.model;

import java.io.Serializable;
import java.util.List;

import com.develop.test.model.databasemodel.UserDataBaseModel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonIgnoreProperties
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class UserModelRersponse implements Serializable{

	private static final long serialVersionUID = 6374452559178664257L;
	
	List<UserDataBaseModel> ListUserDb;
	
	UserDataBaseModel user;

	public List<UserDataBaseModel> getUserDb() {
		return ListUserDb;
	}

	public void setUserDb(List<UserDataBaseModel> ListUserDb) {
		this.ListUserDb = ListUserDb;
	}

	public UserDataBaseModel getUser() {
		return user;
	}

	public void setUser(UserDataBaseModel user) {
		this.user = user;
	}
}
