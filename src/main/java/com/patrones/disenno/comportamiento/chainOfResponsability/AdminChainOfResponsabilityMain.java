/**
 * 
 */
package com.patrones.disenno.comportamiento.chainOfResponsability;

/**
 * 
 */
public class AdminChainOfResponsabilityMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RequestChainOfResponsability requestChainOfResponsability = new RequestChainOfResponsability();
		requestChainOfResponsability.setMontoRembolso(600);
		
		ManejadorSupervisor manejadorSupervisor = new ManejadorSupervisor();
		ManejadorGerente manejadorGerente = new ManejadorGerente();
		ManejadorDuenno manejadorDuenno = new ManejadorDuenno();
		
		manejadorSupervisor.setSiguienteManejadorRembolso(manejadorGerente);
		manejadorSupervisor.setSiguienteManejadorRembolso(manejadorDuenno);
		
		manejadorSupervisor.manjeadorSolicitudes(requestChainOfResponsability);
		System.out.println(requestChainOfResponsability.getResultadoRembolso());
		
	}

}
