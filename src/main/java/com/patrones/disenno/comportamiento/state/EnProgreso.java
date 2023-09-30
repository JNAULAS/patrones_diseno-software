/**
 * 
 */
package com.patrones.disenno.comportamiento.state;

/**
 * 
 */
public class EnProgreso implements TareaState{
	
	private TareaContext tareaContext;
	
	public EnProgreso (TareaContext tareaContextP) {
		this.tareaContext = tareaContextP;
	}


	@Override
	public void asignarTarea() {
		// TODO Auto-generated method stub
		System.out.println("Tarea Asignada con exito");
		
	}

	@Override
	public void actuaizarProgreso() {
		// TODO Auto-generated method stub
		System.out.println("Estado actual en progreso");
	}

	@Override
	public void revisartareaCompletada() {
		// TODO Auto-generated method stub
		System.out.println("La tarea no esta completada");
		
	}
	@Override
	public void cambiarEstado() {
		// TODO Auto-generated method stub
		this.tareaContext.setTareaState(new Completada(this.tareaContext));
		
	}



}
