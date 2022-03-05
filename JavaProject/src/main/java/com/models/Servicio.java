package com.models;
import java.util.HashSet;

public class Servicio {
	//Atributos
	private Double serValorBase;
	private Double serDistancia;
	HashSet<Habilidades> habilidades = new HashSet<Habilidades>();
	HashSet<Oferente> oferente = new HashSet<Oferente>();

	
	//Constructor
	public Servicio(Double serValorBase,Double serDistancia) {
		this.serValorBase = serValorBase;
		this.serDistancia = serDistancia;
	}
	
	//Metodoss
	public Double getSerValorBase() {
		return serValorBase;
	}
	
	public Double getSerDistancia() {
		return serDistancia;
	}
}
