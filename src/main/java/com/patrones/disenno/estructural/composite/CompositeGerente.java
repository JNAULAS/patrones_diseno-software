/**
 * 
 */
package com.patrones.disenno.estructural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class CompositeGerente extends EmpleadoComponente {
	private List<EmpleadoComponente> empleadoComponentes = new ArrayList<EmpleadoComponente>();

	@Override
	public String obtenerNombre() {
		// TODO Auto-generated method stub
		return "Gerente: "+ super.getNombre();
	}
	
	public void add(EmpleadoComponente empleadoComponente) {
	this.empleadoComponentes.add(empleadoComponente);
	}
	public void delete(EmpleadoComponente empleadoComponente) {
		this.empleadoComponentes.remove(empleadoComponente);
	}

	public List<EmpleadoComponente> getEmpleadoComponentes() {
		return empleadoComponentes;
	}

	public void setEmpleadoComponentes(List<EmpleadoComponente> empleadoComponentes) {
		this.empleadoComponentes = empleadoComponentes;
	}

}
