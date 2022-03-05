package com.models;

public class Hacedor extends Usuario{
	public Hacedor(String usuNombre,String usuContra) {
		super(usuNombre,usuContra);
	}

	@Override
	String obtenerInformacion() {
		String informacion = "BIENVENIDO HACEDOR!"+"Nombre: " + this.getUsuNombre() + " Contra: "+this.getUsuContra();
		return informacion;
	}

	public void mostrarInformacion() {
		System.out.println(this.obtenerInformacion());
	}
	
}
