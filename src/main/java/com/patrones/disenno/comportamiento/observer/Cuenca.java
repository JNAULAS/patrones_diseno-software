/**
 * 
 */
package com.patrones.disenno.comportamiento.observer;

/**
 * 
 */
public class Cuenca implements CambioClima {
	private boolean cuencaNotificado;
	
	
	public boolean isCuencaNotificado() {
		return cuencaNotificado;
	}


	public void setCuencaNotificado(boolean cuencaNotificado) {
		this.cuencaNotificado = cuencaNotificado;
	}


	@Override
	public boolean notificarCambioClima(boolean cambioClima) {
		// TODO Auto-generated method stub
		this.cuencaNotificado = cambioClima;
		return this.cuencaNotificado;
	}

}
