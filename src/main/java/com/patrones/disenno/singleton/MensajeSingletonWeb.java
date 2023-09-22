/**
 * 
 */
package com.patrones.disenno.singleton;

/**
 * 
 */
public class MensajeSingletonWeb {
	
	//Metodo para registro de mensajes a la instancia
	@SuppressWarnings("static-access")
	public void CargaMensaje(String mensajeRegistrar){
		
		MensajeSingleton instanceAcceso = MensajeSingleton.getInstance();
		instanceAcceso.getInstance().getListMensajes().add(mensajeRegistrar);
		
	}

}
