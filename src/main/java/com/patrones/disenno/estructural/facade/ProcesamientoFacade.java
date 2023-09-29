/**
 * 
 */
package com.patrones.disenno.estructural.facade;

/**
 * 
 */
public class ProcesamientoFacade {
	private Editor editor = new Editor();
	private Imagen imagen = new Imagen();
	private Filtro filtro = new Filtro();

	public String cargarImagen(Imagen imagenC) {
		return imagen.cargar(imagenC);
	}

	public Imagen modificarImagen(Imagen imagenM, TipoAccion tipoAccion) {
		Imagen imagenrRetorno = null;
		switch (tipoAccion) {
		case REDIMENSIONAR:
			imagenrRetorno = editor.redimensionarImagen(imagenM);
			break;
		case RECORTAR:
			imagenrRetorno = editor.recortarImagen(imagenM);
			break;
		case APLICAR_FILTRO:
			imagenrRetorno = filtro.aplicarFiltro(imagenM);
			break;
		default:
			break;
		}
		return imagenrRetorno;
	}

	public String guardarImagen(Imagen imagenG) {

		return imagen.guardar(imagenG);
	}

}
