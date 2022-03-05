package com.models;
import java.util.HashSet;

public class Notificaciones {
	private String notDescripcion;
	HashSet<Notificaciones> notificaciones = new HashSet<Notificaciones>();
	
	public Notificaciones(String notDescripcion) {
		this.notDescripcion = notDescripcion;
	}
	
	public String getnotDescripcion() {
		return notDescripcion;
	}
}
