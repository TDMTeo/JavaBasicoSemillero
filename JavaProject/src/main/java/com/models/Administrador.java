package com.models;

public class Administrador extends Usuario{
	//Constructor
	public Administrador (String usuNombre,String usuContra) {
		super(usuNombre,usuContra);
	}
	
	//Metodos
	@Override
	String obtenerInformacion() {
		String informacion = "BIENVENIDO ADMINISTRADOR! "+ "Nombre: " + this.getUsuNombre() + " Contra: "+this.getUsuContra();
		return informacion;
	}

	public void mostrarInformacion() {
		System.out.println(this.obtenerInformacion());
	}

	public String agregarTarea() {
		return null;
	}
	
}
