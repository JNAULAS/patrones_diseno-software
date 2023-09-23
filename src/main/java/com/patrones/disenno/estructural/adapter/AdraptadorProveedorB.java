/**
 * 
 */
package com.patrones.disenno.estructural.adapter;

/**
 * 
 */
public class AdraptadorProveedorB implements PagoServicio {
	ProveedorB proveedorB = new ProveedorB();

	@Override
	public boolean consultarPago(String numeroServicio) {
		// TODO Auto-generated method stub
		return proveedorB.consultaPago(numeroServicio);
	}

	@Override
	public String procesarPago(String numeroServicio, double valorPago) {
		// TODO Auto-generated method stub
		String valorRetorno = "Error pago";
		if (proveedorB.procesarPago(numeroServicio, valorPago)!=null) {
			valorRetorno = "El pago se realizo con exito: " + "\n" + "Numero servicio: " + numeroServicio + "\n"
					+ "Valor Pago: " + valorPago + "\n" + "Resultado: " + "Pago exitoso.";
		}
		return valorRetorno;
	}

}
