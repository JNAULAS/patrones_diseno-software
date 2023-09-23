package com.patrones.disenno.estructural.composite;

public abstract class EmpleadoComponente {
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract String obtenerNombre();
}
