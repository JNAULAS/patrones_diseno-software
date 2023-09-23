/**
 * 
 */
package com.patrones.disenno.estructural.adapter;

/**
 * 
 */
public interface PagoServicio {
	public abstract boolean consultarPago(String numeroServicio);
	public abstract String procesarPago(String numeroServicio, double valorPago);
}
