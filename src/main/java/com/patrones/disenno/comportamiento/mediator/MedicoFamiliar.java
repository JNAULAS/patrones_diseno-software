package com.patrones.disenno.comportamiento.mediator;

public class MedicoFamiliar extends Component {

	public MedicoFamiliar(Mediator mediador) {
		super(mediador);
	}
	
	public void derivarEspecialista() {
		this.getMediador().notificar(this, "derivar");
	}

}
