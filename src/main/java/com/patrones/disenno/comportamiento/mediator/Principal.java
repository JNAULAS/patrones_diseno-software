package com.patrones.disenno.comportamiento.mediator;

public class Principal {

	
	public static void main(String[] args) {
		MedicoGeneral afiliado1 = new MedicoGeneral(null);
		MedicoFamiliar afiliado2 = new MedicoFamiliar(null);
		MedicoGinecologo afiliado3 = new MedicoGinecologo(null);
		ManejadorCitas mediador = new ManejadorCitas(afiliado1,afiliado2,afiliado3);
		afiliado1.derivarEspecialista();
		afiliado2.derivarEspecialista();
		afiliado3.examenesMedicos();
	}
}
