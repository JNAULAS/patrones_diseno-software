/**
 * 
 */
package com.patrones.disenno.estructural.decorator;

/**
 * 
 */
public class PersonajeArmadura extends PersonajeDecorador  {

	public PersonajeArmadura(Personaje personajeP) {
		super(personajeP);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String agregarPersonaje() {
		// TODO Auto-generated method stub
		return super.agregarPersonaje() + " se ha agregado una armadura";
	}

}
