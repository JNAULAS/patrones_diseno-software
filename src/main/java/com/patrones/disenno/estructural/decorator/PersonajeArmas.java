/**
 * 
 */
package com.patrones.disenno.estructural.decorator;

/**
 * 
 */
public class PersonajeArmas  extends PersonajeDecorador  {

	public PersonajeArmas(Personaje personajeP) {
		super(personajeP);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String agregarPersonaje() {
		// TODO Auto-generated method stub
		return super.agregarPersonaje() + " se ha agregado una arma";
	}
	

}
