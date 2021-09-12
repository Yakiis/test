package com.develop.test.model.responsemodel;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1103877432466659099L;

	private String userName;
	
	private String password;
	
	private String rol;
	
	private String correo;
	
	private String sexo;		

	public User(String userName, String password, String rol, String correo, String sexo) {
		super();
		this.userName = userName;
		this.password = password;
		this.rol = rol;
		this.correo = correo;
		this.sexo = sexo;
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
