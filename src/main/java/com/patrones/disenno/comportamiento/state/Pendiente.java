/**
 * 
 */
package com.patrones.disenno.comportamiento.state;

/**
 * 
 */
public class Pendiente implements TareaState {
	
	private TareaContext tareaContext;

	public Pendiente (TareaContext tareaContextP) {
		this.tareaContext = tareaContextP;
	}

	@Override
	public void asignarTarea() {
		// TODO Auto-generated method stub
		System.out.println("No se puede asignar tarea");
		
	}

	@Override
	public void actuaizarProgreso() {
		// TODO Auto-generated method stub
		System.out.println("Estado actual en pendiente");
	}

	@Override
	public void revisartareaCompletada() {
		// TODO Auto-generated method stub
		System.out.println("La tarea no esta completada");
		
	}

	@Override
	public void cambiarEstado() {
		// TODO Auto-generated method stub
		this.tareaContext.setTareaState(new EnProgreso(this.tareaContext));
		
	}

}
