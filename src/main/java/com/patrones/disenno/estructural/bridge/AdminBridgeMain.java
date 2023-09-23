/**
 * 
 */
package com.patrones.disenno.estructural.bridge;

/**
 * 
 */
public class AdminBridgeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CorreoApp app = new CorreoApp(new Outlook());
		app.verificarIdentificador();
		app.enviarCorreo();
		

	}

}
