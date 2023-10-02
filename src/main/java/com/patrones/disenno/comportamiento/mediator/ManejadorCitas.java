package com.patrones.disenno.comportamiento.mediator;

public class ManejadorCitas implements Mediator {

	private MedicoGeneral afiliado1;
	private MedicoFamiliar afiliado2;
	private MedicoGinecologo afiliado3;
	
	public ManejadorCitas(MedicoGeneral afiliado1, MedicoFamiliar afiliado2, MedicoGinecologo afiliado3) {
		this.afiliado1 = afiliado1;
		this.afiliado1.setMediador(this);
		this.afiliado2 = afiliado2;
		this.afiliado2.setMediador(this);
		this.afiliado3 = afiliado3;
		this.afiliado3.setMediador(this);
	}
	
	public ManejadorCitas() {
	}

	@Override
	public void notificar(Component remitente, String event) {
		if (remitente.equals(afiliado1) && event.equals("derivar")) 
			System.out.println("El medico general deriva a un especialista");
		if (remitente.equals(afiliado2) && event.equals("derivar"))
			System.out.println("El medico familiar deriva a un especialista");
		if (remitente.equals(afiliado3) && event.equals("examenes"))
			System.out.println("El medico ginecologo necesita examenes");
		if ((remitente.equals(afiliado1) || remitente.equals(afiliado2) || remitente.equals(afiliado3)) && event.equals("cancelar"))
			System.out.println("Se ha cancelado la cita");
		if ((remitente.equals(afiliado1) || remitente.equals(afiliado2) || remitente.equals(afiliado3)) && event.equals("reagendar"))
			System.out.println("Se ha reagendado la cita");
	}

}
