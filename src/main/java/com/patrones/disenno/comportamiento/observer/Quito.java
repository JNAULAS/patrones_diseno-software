/**
 * 
 */
package com.patrones.disenno.comportamiento.observer;

/**
 * 
 */
public class Quito  implements CambioClima {
	private boolean quitoNotificado;
	
	
	
	public boolean isQuitoNotificado() {
		return quitoNotificado;
	}



	public void setQuitoNotificado(boolean quitoNotificado) {
		this.quitoNotificado = quitoNotificado;
	}



	@Override
	public boolean notificarCambioClima(boolean cambioClima) {
		// TODO Auto-generated method stub
		this.quitoNotificado = cambioClima;
		return this.quitoNotificado;
	}

}
