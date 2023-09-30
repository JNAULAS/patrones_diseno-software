/**
 * 
 */
package com.patrones.disenno.comportamiento.TemplateMethod;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 */
public class AdminTemplateMethodMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Producto noPerecedero = new ProductoNoPerecedero();
		noPerecedero.setId(01);
		noPerecedero.setNombre("Escoba");
		noPerecedero.setPrecio(2.50);
		noPerecedero.GestionarPedido();
		

	      Producto perecederos = new ProductoPerecederos();
		perecederos.setId(02);
		perecederos.setNombre("Avena");
		perecederos.setPrecio(0.70);
		perecederos.GestionarPedido();
		

	}

}
