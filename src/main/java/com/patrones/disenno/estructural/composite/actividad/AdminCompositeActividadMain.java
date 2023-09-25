/**
 * 
 */
package com.patrones.disenno.estructural.composite.actividad;

/**
 * 
 */
public class AdminCompositeActividadMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TipoDocumento tipoDocumentoSeteo = TipoDocumento.WORD;

		switch (tipoDocumentoSeteo) {
		case WORD:
			Carpeta carpeta1 = new Carpeta();
			carpeta1.setNombreCarpeta("CarpetaWord");
			ComponentArchivo archivoWord = new Docx("Composition.docx");
			carpeta1.agregarArchivo(archivoWord);
			ComponentArchivo archivoWord1 = new Docx("Composition1.docx");
			carpeta1.agregarArchivo(archivoWord1);
			ComponentArchivo archivoWord2 = new Docx("Composition2.docx");
			carpeta1.agregarArchivo(archivoWord2);
			System.out.println("Los archivos " + tipoDocumentoSeteo + "cargados son: " + carpeta1.obtenerTamanoArchivo());
			break;
		case PDF:
			ComponentArchivo archivoPDF = new Pdf("Composition.pdf");
			ComponentArchivo archivoPDF1 = new Pdf("Composition1.pdf");
			Carpeta carpeta2 = new Carpeta();
			carpeta2.agregarArchivo(archivoPDF);
			carpeta2.agregarArchivo(archivoPDF1);
			System.out.println("Los archivos " + tipoDocumentoSeteo + " cargados son: " + carpeta2.obtenerTamanoArchivo());
			break;
		case EXCEL:
			ComponentArchivo archivoEXCEL = new Pdf("Composition.xls");
			ComponentArchivo archivoEXCEL1 = new Pdf("Composition1.xls");
			ComponentArchivo archivoEXCEL2 = new Pdf("Composition2.xls");
			ComponentArchivo archivoEXCEL3 = new Pdf("Composition3.xls");
			Carpeta carpeta3 = new Carpeta();
			carpeta3.agregarArchivo(archivoEXCEL);
			carpeta3.agregarArchivo(archivoEXCEL1);
			carpeta3.agregarArchivo(archivoEXCEL2);
			carpeta3.agregarArchivo(archivoEXCEL3);
			System.out.println("Los archivos " + tipoDocumentoSeteo + "cargados son: " + carpeta3.obtenerTamanoArchivo());
			break;
		}

	}

}
