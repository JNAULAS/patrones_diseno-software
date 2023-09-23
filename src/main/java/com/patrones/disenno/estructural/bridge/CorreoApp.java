/**
 * 
 */
package com.patrones.disenno.estructural.bridge;

/**
 * 
 */
public class CorreoApp extends Correo {

	public CorreoApp(ImplementadorProveedorCorreo implementadorProveedorCorreo) {
		super(implementadorProveedorCorreo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String verificarIdentificador() {
		// TODO Auto-generated method stub
		System.out.println("Enviador desde la App");
		return this.getIndicador();
	}
	
}
