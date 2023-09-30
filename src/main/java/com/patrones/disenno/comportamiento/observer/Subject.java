/**
 * 
 */
package com.patrones.disenno.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public abstract class Subject {
	private List<CambioClima> listCambioClima = new ArrayList<CambioClima>();
	
	
	public List<CambioClima> getListCambioClima() {
		return listCambioClima;
	}
	public void setListCambioClima(List<CambioClima> listCambioClima) {
		this.listCambioClima = listCambioClima;
	}
	
	public abstract void attach(CambioClima cambioClima);
	public abstract void detach(CambioClima cambioClima);
	public abstract void notificar();
}
