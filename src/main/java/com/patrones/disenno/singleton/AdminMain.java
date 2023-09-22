/**
 * 
 */
package com.patrones.disenno.singleton;

/**
 * 
 */
public class AdminMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos instancia de la clase
		MensajeSingletonWeb mensajeWeb = new MensajeSingletonWeb();
		mensajeWeb.CargaMensaje("Error Acceso");
		mensajeWeb.CargaMensaje("Error Credenciales");

		// Obtiene valores de retorno
		for (String mensaje : MensajeSingleton.getInstance().getListMensajes()) {
			System.out.println("Mensaje almacenado: " + mensaje);
		}

	}

}
