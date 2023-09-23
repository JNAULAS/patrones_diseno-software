/**
 * 
 */
package com.patrones.disenno.estructural.adapter;

/**
 * 
 */
public class AdaptadorProveedorA implements PagoServicio {
	
	ProveedorA proveedorA = new ProveedorA();

	@Override
	public boolean consultarPago(String numeroServicio) {
		// TODO Auto-generated method stub
		return this.proveedorA.consultaPago(numeroServicio);
	}

	@Override
	public String procesarPago(String numeroServicio, double valorPago) {
		// TODO Auto-generated method stub
		String valorRetorno = "Error pago";
		if (proveedorA.procesarPago(numeroServicio, valorPago)!=null) {
			valorRetorno = "El pago se realizo con exito: " + "\n" + "Numero servicio: " + numeroServicio + "\n"
					+ "Valor Pago: " + valorPago + "\n" + "Resultado: " + "Pago exitoso.";
		}
		return valorRetorno;
	}

}
