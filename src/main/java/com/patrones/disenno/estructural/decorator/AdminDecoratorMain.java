/**
 * 
 */
package com.patrones.disenno.estructural.decorator;

/**
 * 
 */
public class AdminDecoratorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PersonajeImpl personajeImpl = new PersonajeImpl();
		PersonajeArmas armas = new PersonajeArmas(personajeImpl);
		PersonajeArmadura personajeArmadura = new PersonajeArmadura(armas);
		
		
		System.out.println(personajeArmadura.agregarPersonaje());
		

	}

}
