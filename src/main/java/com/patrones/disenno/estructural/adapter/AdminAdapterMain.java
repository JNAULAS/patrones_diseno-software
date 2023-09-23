/**
 * 
 */
package com.patrones.disenno.estructural.adapter;

/**
 * 
 */
public class AdminAdapterMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean consultaOk = false;
		boolean pagoOk = false;
		
		AdaptadorProveedorA adaptadorProveedorA = new AdaptadorProveedorA();
		
		if (adaptadorProveedorA.consultarPago("12")) {
			System.out.println(adaptadorProveedorA.procesarPago("12", 15));
		}
		//Resultado Pago: " + pagoOk);
		// Proceso Pago B
		AdraptadorProveedorB adraptadorProveedorB = new AdraptadorProveedorB();
		
		if (adraptadorProveedorB.consultarPago("25")) {
			System.out.println(adraptadorProveedorB.procesarPago("ip056", 30));
		}
		
		
	}
}
