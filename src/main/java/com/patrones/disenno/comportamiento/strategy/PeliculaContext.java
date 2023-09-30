/**
 * 
 */
package com.patrones.disenno.comportamiento.strategy;

/**
 * 
 */
public class PeliculaContext {

	public String visualizarRecomendacion(tipoRecomendacionPelicula tipoRecomendacionPelicula) {
		String retorno = "";
		switch (tipoRecomendacionPelicula) {
		case GENERO:
			Genero genero = new Genero();
			retorno = genero.generarRecomendacion();
			break;
		case POPULAR:
			Popularidad popularidad = new Popularidad();
			retorno = popularidad.generarRecomendacion();
			break;
		case SIMILITUD:
			Similitud similitud = new Similitud();
			retorno = similitud.generarRecomendacion();
			break;
		default:
			throw new AssertionError();
		}

		return retorno;
	}

}
