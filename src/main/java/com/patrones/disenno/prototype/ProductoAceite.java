/**
 * 
 */
package com.patrones.disenno.prototype;

/**
 * 
 */
public class ProductoAceite extends Producto {

	//private int cantidadListros;
	public ProductoAceite (double precio, String categoria){
		this.setNombre("Aceite");
		this.setPrecio(precio);
		this.setCategoria(categoria);
	}
	@Override
	public Producto colonar() {
		// TODO Auto-generated method stub
		return new ProductoAceite(this.getPrecio(), this.getCategoria());
	}

}
