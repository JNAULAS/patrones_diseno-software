/**
 * 
 */
package com.patrones.disenno.comportamiento.TemplateMethod;

/**
 * 
 */
public abstract class Producto {
	private int id;
	private String nombre;
	private double precio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	public void GestionarPedido() {
		
		System.out.println(empacar() + " " +almacenar() + " " + enviar());
	}

	public abstract String empacar();
	public abstract String almacenar();
	public abstract String enviar();
}
