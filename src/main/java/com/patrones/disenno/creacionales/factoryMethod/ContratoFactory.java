/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patrones.disenno.creacionales.factoryMethod;

/**
 *
 * @author Mauricio Ortiz
 */
public class ContratoFactory extends ContratoAbstractFactory{

    @Override
    public Contrato crearContratoFactory(TipoContrato tipoContrato) {
        switch (tipoContrato) {
            case FIJO:
                return new ContratoFijo();
            case TEMPORAL:
                return new ContratoTemporal();
            case FACTURA:
                return new ContratoFactura();            
            case ENLINEA:
                return new ContratoEnLinea();            
                
            default:
                throw new IllegalArgumentException("Parámetro inválido");
        }
    }

}
