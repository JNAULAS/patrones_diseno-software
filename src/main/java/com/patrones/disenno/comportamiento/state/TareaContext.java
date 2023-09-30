/**
 * 
 */
package com.patrones.disenno.comportamiento.state;

/**
 * 
 */
public class TareaContext {
	
	private  TareaState tareaState;
	
	
	public TareaState getTareaState() {
		return tareaState;
	}


	public void setTareaState(TareaState tareaState) {
		this.tareaState = tareaState;
	}


	public void creaaTarea( ) {
		tareaState = new Pendiente(this);
	}

}
