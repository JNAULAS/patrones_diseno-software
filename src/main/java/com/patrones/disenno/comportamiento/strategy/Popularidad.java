/**
 * 
 */
package com.patrones.disenno.comportamiento.strategy;

/**
 * 
 */
public class Popularidad implements Recomendacion {

	@Override
	public String generarRecomendacion() {
		// TODO Auto-generated method stub
		return "La pelicula mas popular es Cantimflas";
	}

	@Override
	public String guardarRecomendacion() {
		// TODO Auto-generated method stub
		return "Se a guardado la pelicula mas popular";
	}



}
