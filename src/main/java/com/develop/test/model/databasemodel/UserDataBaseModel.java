package com.develop.test.model.databasemodel;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.develop.test.model.responsemodel.UserModel;

@Entity
@Table(name="user_profile")
public class UserDataBaseModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long   id;
	
	private String userName;
	
	private String password;
	
	private String rol;
	
	private String correo;
	
	private String sexo;
	
	

	public UserDataBaseModel() {
	
	}

	public UserDataBaseModel(UserModel user,Long id) {
		super();
		this.id = id;
		this.userName = user.getUserName();
		this.password = user.getPassword();
		this.rol      = user.getRol();
		this.correo   = user.getCorreo();
		this.sexo     = user.getSexo();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	
}
