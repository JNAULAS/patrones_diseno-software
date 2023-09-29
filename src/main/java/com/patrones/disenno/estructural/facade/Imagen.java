/**
 * 
 */
package com.patrones.disenno.estructural.facade;

/**
 * 
 */
public class Imagen {
	
	private String nombre; 
	private int largo;
	private int ancho;
	private boolean filtro;
	private int peso;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public boolean isFiltro() {
		return filtro;
	}
	public void setFiltro(boolean filtro) {
		this.filtro = filtro;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String cargar(Imagen imagenC) {
		return "Imagen cargado con exito + Ancho: "+ imagenC.getAncho() + " " + imagenC.getNombre();
	}
	
	public String guardar(Imagen imagenC) {
		return "Guardado exitosamente + Ancho: "+ imagenC.getAncho() + " " + imagenC.getNombre();
	}


}
