package com.models;
import java.util.HashSet;

public class Habilidades {
	
	//Atributos
	private Double habPrecioEsperado;
	private Double habRangoViaje;
	Hacedor hacedor[];
    HashSet<Tarea> tarea = new HashSet<Tarea>();
	
	//Constructor
	public Habilidades(Double habPrecioEsperado,Double habRangoViaje) {
		this.habPrecioEsperado = habPrecioEsperado;
		this.habRangoViaje = habRangoViaje;
		hacedor = new Hacedor[2];
	}
	
	//Metodos 
	public Double habPrecioEsperado() {
		return habPrecioEsperado;
	}
	
	public Double habRangoDeViaje() {
		return habRangoViaje;
	}
}
