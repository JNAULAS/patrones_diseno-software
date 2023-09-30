/**
 * 
 */
package com.patrones.disenno.comportamiento.strategy;

/**
 * 
 */
public class AdminStrategyMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeliculaContext peliculaContext = new PeliculaContext();
		System.out.println(peliculaContext.visualizarRecomendacion(tipoRecomendacionPelicula.POPULAR));
		

	}

}
