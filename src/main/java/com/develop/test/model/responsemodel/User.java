package com.develop.test.model.responsemodel;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1103877432466659099L;

	private String nombre;
	
	private String apellido;
	
	private String edad;

	public User(String nombre, String apellido, String edad) {	
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public User() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	
	
}
