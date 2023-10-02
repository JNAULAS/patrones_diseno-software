/**
 * 
 */
package com.patrones.disenno.comportamiento.chainOfResponsability;

/**
 * 
 */
public class ManejadorDuenno extends ManejadorRembolsoBase {

	@Override
	public void manjeadorSolicitudes(RequestChainOfResponsability requestChainOfResponsability) {
		// TODO Auto-generated method stub
		if (requestChainOfResponsability.getMontoRembolso() <= 600) {
			requestChainOfResponsability
					.setResultadoRembolso("El rembolso fue aprobado por el Gerente - Monto Aprobado: "
							+ requestChainOfResponsability.getMontoRembolso());
		} else {
			super.manjeadorSolicitudes(requestChainOfResponsability);
		}
	}

}
