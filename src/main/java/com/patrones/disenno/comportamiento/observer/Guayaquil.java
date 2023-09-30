/**
 * 
 */
package com.patrones.disenno.comportamiento.observer;

/**
 * 
 */
public class Guayaquil  implements CambioClima {
	private boolean guayaquilNotificado;
	
	
	public boolean isGuayaquilNotificado() {
		return guayaquilNotificado;
	}


	public void setGuayaquilNotificado(boolean guayaquilNotificado) {
		this.guayaquilNotificado = guayaquilNotificado;
	}


	@Override
	public boolean notificarCambioClima(boolean cambioClima) {
		// TODO Auto-generated method stub
		this.guayaquilNotificado = cambioClima;
		return this.guayaquilNotificado;
	}

}
