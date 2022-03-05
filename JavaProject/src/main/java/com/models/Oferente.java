package com.models;

public class Oferente extends Usuario {
	
	public Oferente(String usuNombre,String usuContra) {
		super(usuNombre,usuContra);
	}

	@Override
	String modificarInformacion() {
		return null;
	}

	
}
