package com.models;

public abstract class Usuario {
	private String usuNombre;
	private String usuContra;
	
	
	public Usuario(String usuNombre,String usuContra) {
		this.usuNombre = usuNombre;
		this.usuContra = usuContra;
	}
	
	public String getUsuNombre() {
		return usuNombre;
	}
	
	public String getUsuContra() {
		return usuContra;
	}
	
	abstract String obtenerInformacion();
	 
}
