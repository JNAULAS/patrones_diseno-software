/**
 * 
 */
package com.patrones.disenno.comportamiento.state;

/**
 * 
 */
public interface  TareaState {
	
	
	public  void asignarTarea();
	public  void actuaizarProgreso();
	public  void revisartareaCompletada();

	public void cambiarEstado();
}
