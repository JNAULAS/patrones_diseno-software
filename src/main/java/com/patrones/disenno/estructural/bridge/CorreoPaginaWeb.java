/**
 * 
 */
package com.patrones.disenno.estructural.bridge;

/**
 * 
 */
public class CorreoPaginaWeb extends Correo {



	public CorreoPaginaWeb(ImplementadorProveedorCorreo implementadorProveedorCorreo) {
		super(implementadorProveedorCorreo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String verificarIdentificador() {
		// TODO Auto-generated method stub
		System.out.println("Enviador desde la Web");
		return this.getIndicador();
	}

}
