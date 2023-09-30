/**
 * 
 */
package com.patrones.disenno.comportamiento.state;

/**
 * 
 */
public class Completada implements TareaState {
	
	private TareaContext tareaContext;

	public Completada (TareaContext tareaContextP) {
		this.tareaContext = tareaContextP;
	}

	@Override
	public void asignarTarea() {
		// TODO Auto-generated method stub
		System.out.println("No se puede  asignar tarea");
		
	}

	@Override
	public void actuaizarProgreso() {
		// TODO Auto-generated method stub
		System.out.println("No se puede cambiar estado a en progreso");
	}

	@Override
	public void revisartareaCompletada() {
		// TODO Auto-generated method stub
		System.out.println("Tarea completada se puede descargar el archivo");
		
	}
	@Override
	public void cambiarEstado() {
		// TODO Auto-generated method stub
		
		
	}

}
