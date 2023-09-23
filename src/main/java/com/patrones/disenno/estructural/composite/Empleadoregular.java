/**
 * 
 */
package com.patrones.disenno.estructural.composite;

/**
 * 
 */
public class Empleadoregular extends EmpleadoComponente {

	@Override
	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return "Empleado Regular: "+ super.getNombre();
	}

}
