package com.models;

public class Hacedor extends Usuario{
	public Hacedor(String usuNombre,String usuContra) {
		super(usuNombre,usuContra);
	}

	@Override
	String modificarInformacion() {
		return null;
	}
	
}
