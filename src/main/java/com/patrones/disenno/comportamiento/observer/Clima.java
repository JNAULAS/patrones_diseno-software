/**
 * 
 */
package com.patrones.disenno.comportamiento.observer;

/**
 * 
 */
public class Clima extends Subject{
	
	private boolean cambioSignificativo;
	

	public boolean isCambioSignificativo() {
		return cambioSignificativo;
	}

	public void setCambioSignificativo(boolean cambioSignificativo) {
		this.cambioSignificativo = cambioSignificativo;
	}

	@Override
	public void attach(CambioClima cambioClima) {
		// TODO Auto-generated method stub
		this.getListCambioClima().add(cambioClima);
		
	}

	@Override
	public void detach(CambioClima cambioClima) {
		// TODO Auto-generated method stub
		this.getListCambioClima().remove(cambioClima);
		
	}

	@Override
	public void notificar() {
		// TODO Auto-generated method stub
		for (CambioClima climas : this.getListCambioClima()) {
			climas.notificarCambioClima(this.cambioSignificativo);
		}
		
	}

}
