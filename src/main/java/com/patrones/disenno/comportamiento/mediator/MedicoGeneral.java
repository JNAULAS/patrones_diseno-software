package com.patrones.disenno.comportamiento.mediator;

public class MedicoGeneral extends Component {

	public MedicoGeneral(Mediator mediador) {
		super(mediador);
	}

	public void derivarEspecialista() {
		this.getMediador().notificar(this, "derivar");
	}
}
