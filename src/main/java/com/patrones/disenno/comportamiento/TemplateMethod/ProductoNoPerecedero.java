/**
 * 
 */
package com.patrones.disenno.comportamiento.TemplateMethod;

import java.util.Date;

/**
 * 
 */
public class ProductoNoPerecedero extends Producto {
	private Date fechaFabricacion;

	public Date getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion(Date fechaFabricacion) {
		this.fechaFabricacion = fechaFabricacion;
	}

	@Override
	public String empacar() {
		// TODO Auto-generated method stub
		this.setFechaFabricacion(new Date());
		
		return "Producto " + super.getNombre() + "empacado con exito: fecha de fabricacion: "+ this.fechaFabricacion ;
	}

	@Override
	public String almacenar() {
		// TODO Auto-generated method stub
		return "Producto " + super.getNombre() + "almacenado con exito";
	}

	@Override
	public String enviar() {
		// TODO Auto-generated method stub
		return "Producto " + super.getNombre() + " enviado con exito";
	}
	

}
