/**
 * 
 */
package com.patrones.disenno.prototype;

/**
 * 
 */
public class AdminMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductoPapa productoPapa1 = new ProductoPapa(3, "Super chola");
		ProductoPapa productoPapa2 = new ProductoPapa(2, "Chaucha");
		System.out.println("Datos del Producto: " + productoPapa1.getNombre());
		
		ProductoAceite productoAceite1 = new ProductoAceite(8, "Favorita");
		ProductoAceite productoAceite2 = new ProductoAceite(7, "Girasol");
		
		System.out.println("Datos del Producto: " + productoAceite1.getNombre());

	}

}
