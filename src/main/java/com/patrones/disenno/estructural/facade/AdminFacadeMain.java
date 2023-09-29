/**
 * 
 */
package com.patrones.disenno.estructural.facade;

/**
 * 
 */
public class AdminFacadeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imagen imagenRetorno = new Imagen();
		
		ProcesamientoFacade procesamientoFacade = new ProcesamientoFacade();
		Imagen imagenCarga = new Imagen();
		imagenCarga.setNombre("Nombre Inicial.png");
		imagenCarga.setAncho(10);
		imagenCarga.setLargo(5);
		imagenCarga.setPeso(10);
		imagenCarga.setFiltro(false);
		
		System.out.println(procesamientoFacade.cargarImagen(imagenCarga)); 
		
		System.out.println(procesamientoFacade.guardarImagen(imagenCarga)); 
		
		imagenCarga.setNombre("NombreUpdate.png");
		imagenCarga.setAncho(80);
		imagenCarga.setLargo(5);
		imagenRetorno = procesamientoFacade.modificarImagen(imagenCarga, TipoAccion.REDIMENSIONAR);
		System.out.println("Imangen actualizada con exito: Ancho: "+ imagenRetorno.getAncho() + " filtro: "+imagenRetorno.isFiltro());
		imagenCarga.setFiltro(true);
		imagenRetorno = procesamientoFacade.modificarImagen(imagenCarga, TipoAccion.APLICAR_FILTRO);
		System.out.println("Aplicado Filtro a imagen: "+ imagenRetorno.isFiltro());
		
		  
		

	}

}
