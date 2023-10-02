package com.patrones.disenno.comportamiento.mediator;

public class Component {

	private Mediator mediador;

	public Component(Mediator mediador) {
		this.mediador = mediador;
	}

	public String cancelarCita() {
		mediador.notificar(this, "cancelar");
		return "Cita cancelada";
	};
	
	public String reagendarCita() {
		mediador.notificar(this, "reagendar");
		return "Cita reagendada";
	}

	public Mediator getMediador() {
		return mediador;
	}

	public void setMediador(Mediator mediador) {
		this.mediador = mediador;
	};

}
