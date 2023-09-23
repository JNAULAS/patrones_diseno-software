/**
 * 
 */
package com.patrones.disenno.estructural.bridge;

/**
 * 
 */
public abstract class Correo {
	
	private String indicador;
	private ImplementadorProveedorCorreo implementadorProveedorCorreo;
	
	public Correo (ImplementadorProveedorCorreo implementadorProveedorCorreo) {
		this.implementadorProveedorCorreo = implementadorProveedorCorreo;
	}
	
	

	public String getIndicador() {
		return indicador;
	}
	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}
	
	public void enviarCorreo() {
		System.out.println("Correo enviado");
	};
	
	public abstract String verificarIdentificador();
	
	
	
	
	
	
}
