/**
 * 
 */
package com.patrones.disenno.estructural.decorator;

/**
 * 
 */
public abstract class PersonajeDecorador implements Personaje {

	protected Personaje personaje;
	
	
	public PersonajeDecorador(Personaje personajeP) {
		this.personaje = personajeP;
	}


	@Override
	public String agregarPersonaje() {
		// TODO Auto-generated method stub
		String retorno = personaje.agregarPersonaje();
		return retorno;
	}
	
	
}
