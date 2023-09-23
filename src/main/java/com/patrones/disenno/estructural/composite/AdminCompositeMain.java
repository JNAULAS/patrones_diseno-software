/**
 * 
 */
package com.patrones.disenno.estructural.composite;

/**
 * 
 */
public class AdminCompositeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleadoregular empleadoregular = new Empleadoregular();
		Subcontratista subcontratista = new Subcontratista();

		
		CompositeGerente compositeGerente = new CompositeGerente();
		empleadoregular.setNombre("Belen");
		compositeGerente.add(empleadoregular);
		empleadoregular = new Empleadoregular();
		empleadoregular.setNombre("Wilson");
		compositeGerente.add(empleadoregular);
		empleadoregular = new Empleadoregular();
		empleadoregular.setNombre("Freddy");
		compositeGerente.add(empleadoregular);
		empleadoregular = new Empleadoregular();
		empleadoregular.setNombre("Juan");
		compositeGerente.add(empleadoregular);
		
		subcontratista.setNombre("Subcontratsta Wilson");
		compositeGerente.add(subcontratista);
		
		for (EmpleadoComponente empleadoComponente : compositeGerente.getEmpleadoComponentes()) {
			System.out.println(empleadoComponente.obtenerNombre());
		}
		
		compositeGerente.delete(compositeGerente.getEmpleadoComponentes().set(0, compositeGerente));
		for (EmpleadoComponente empleadoComponente : compositeGerente.getEmpleadoComponentes()) {
			System.out.println(empleadoComponente.obtenerNombre());
		}

	}

}
