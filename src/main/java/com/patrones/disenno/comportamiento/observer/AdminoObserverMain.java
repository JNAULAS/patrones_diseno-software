/**
 * 
 */
package com.patrones.disenno.comportamiento.observer;

/**
 * 
 */
public class AdminoObserverMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clima clima = new Clima();
		Cuenca cuenca = new Cuenca();
		Quito quito = new Quito();
		Guayaquil guayaquil = new Guayaquil();
		
		clima.attach(cuenca);
		clima.attach(quito);
		clima.attach(guayaquil);
		
		System.out.println("Cuenca antes de notificar = " +cuenca.isCuencaNotificado());
		
		clima.setCambioSignificativo(true);
		clima.notificar();
		System.out.println("Cuenca = " +cuenca.isCuencaNotificado());
		System.out.println("Quito = " +quito.isQuitoNotificado());
		System.out.println("Guayaquil = " +guayaquil.isGuayaquilNotificado());
		

	}

}
