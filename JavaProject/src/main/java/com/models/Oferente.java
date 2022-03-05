package com.models;

public class Oferente extends Usuario {
	
	public Oferente(String usuNombre,String usuContra) {
		super(usuNombre,usuContra);
	}

	@Override
	String obtenerInformacion() {
		String informacion = "BIENVENIDO OFERENTE!"+"Nombre: " + this.getUsuNombre() + " Contra: "+this.getUsuContra();
		return informacion;
	}

	public void mostrarInformacion() {
		System.out.println(this.obtenerInformacion());
	}

	
}
