package com.patrones.disenno.comportamiento.mediator;

public class MedicoGinecologo extends Component {

	public MedicoGinecologo(Mediator mediador) {
		super(mediador);
	}
	
	public void examenesMedicos() {
		this.getMediador().notificar(this, "examenes");
	}

}
