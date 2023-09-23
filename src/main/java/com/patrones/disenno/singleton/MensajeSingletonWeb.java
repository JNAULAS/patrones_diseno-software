/**
 * 
 */
package com.patrones.disenno.singleton;

/**
 * 
 */
public class MensajeSingletonWeb {

	// Metodo para registro de mensajes a la instancia
	@SuppressWarnings("static-access")
	public void CargaMensaje(String mensajeRegistrar) {
		// Obtener la instancia Singleton
		MensajeSingleton instanceAcceso = MensajeSingleton.getInstance();
		// Establecer la lista de mensajes en la instancia Singleton
		instanceAcceso.getInstance().getListMensajes().add(mensajeRegistrar);

	}

}
