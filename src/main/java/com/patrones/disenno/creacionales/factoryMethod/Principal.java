/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patrones.disenno.creacionales.factoryMethod;

/**
 *
 * @author morti
 */
public class Principal {
    
    public static void main(String[] args) {
    	ContratoFactory contratoFactory = new ContratoFactory();
        System.out.println(contratoFactory.crearContratoFactory(TipoContrato.FIJO).calcularSueldo());
        
    }
    
}
