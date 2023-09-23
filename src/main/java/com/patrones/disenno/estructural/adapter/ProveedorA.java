/**
 * 
 */
package com.patrones.disenno.estructural.adapter;

/**
 * 
 */
public class ProveedorA {
	private String idTransaccion;
	private String estado;
	private String mensaje;

	public String getIdTransaccion() {
		return idTransaccion;
	}

	public void setIdTransaccion(String idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean consultaPago(String codigoPago) {
		return true;
	}
	public String procesarPago (String numeroServicio, double valorPago) {
		return "";
	}

}
