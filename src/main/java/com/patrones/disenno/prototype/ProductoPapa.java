/**
 * 
 */
package com.patrones.disenno.prototype;

/**
 * 
 */
public class ProductoPapa extends Producto {
	
	
	public ProductoPapa ( double precio, String categoria){
		this.setNombre("Papa");
		this.setPrecio(precio);
		this.setCategoria(categoria);
	}

	@Override
	public Producto colonar() {
		// TODO Auto-generated method stub
		return new ProductoPapa( getPrecio(), getCategoria());
	}

}
