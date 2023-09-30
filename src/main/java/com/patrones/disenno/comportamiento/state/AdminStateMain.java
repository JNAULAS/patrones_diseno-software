/**
 * 
 */
package com.patrones.disenno.comportamiento.state;

/**
 * 
 */
public class AdminStateMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TareaContext context = new TareaContext();
		context.creaaTarea();
		context.getTareaState().asignarTarea();
		context.getTareaState().actuaizarProgreso();
		context.getTareaState().revisartareaCompletada();
		
		context.getTareaState().cambiarEstado();
		context.getTareaState().asignarTarea();
		context.getTareaState().actuaizarProgreso();
		context.getTareaState().revisartareaCompletada();
		
		context.getTareaState().cambiarEstado();
		context.getTareaState().asignarTarea();
		context.getTareaState().actuaizarProgreso();
		context.getTareaState().revisartareaCompletada();
		
		

	}

}
