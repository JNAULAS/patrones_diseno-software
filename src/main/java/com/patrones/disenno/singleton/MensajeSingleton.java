/**
 * 
 */
package com.patrones.disenno.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class MensajeSingleton {
	// Define una unica instanica
	private static MensajeSingleton instance;
	private String mensaje;
	private List<String> listMensajes;
	
	

	public MensajeSingleton() {
		super();
		this.listMensajes = new ArrayList<String>();
	}

	// Metodos Getters and Setters
	public static MensajeSingleton getInstance() {
		// Valida si existe instancia
		if (instance == null) {
			instance = new MensajeSingleton();
		}
		return instance;
	}

	public static void setInstance(MensajeSingleton instance) {
		MensajeSingleton.instance = instance;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<String> getListMensajes() {
		return listMensajes;
	}

	public void setListMensajes(List<String> listMensajes) {
		this.listMensajes = listMensajes;
	}

}
