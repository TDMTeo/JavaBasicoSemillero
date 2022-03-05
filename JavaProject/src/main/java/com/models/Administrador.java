package com.models;

public class Administrador extends Usuario{
	public Administrador (String usuNombre,String usuContra) {
		super(usuNombre,usuContra);
	}

	@Override
	String modificarInformacion() {
		return null;
	}

	
	public String agregarTarea() {
		return null;
	}
}
