/**
 * 
 */
package com.patrones.disenno.comportamiento.TemplateMethod;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 */
public class ProductoPerecederos extends Producto {
	
	private Date fechaElaboracion;
	private Date fechaCaducidad;
	public Date getFechaElaboracion() {
		return fechaElaboracion;
	}
	public void setFechaElaboracion(Date fechaElaboracion) {
		this.fechaElaboracion = fechaElaboracion;
	}
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String empacar() {
		Calendar calendar = Calendar.getInstance();
	      calendar.setTime(new Date()); 
	      calendar.add(Calendar.DAY_OF_YEAR, 10);
	      
	      this.setFechaElaboracion(new Date());
	      this.setFechaCaducidad(calendar.getTime());
		// TODO Auto-generated method stub
		return "Producto " + super.getNombre() + "empacado con exito: fecha de empaque: "+ this.fechaElaboracion + " fecha de caducidad: "+ this.fechaCaducidad;
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
