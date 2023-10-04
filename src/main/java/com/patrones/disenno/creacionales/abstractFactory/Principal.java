/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.patrones.disenno.creacionales.abstractFactory;

/**
 *
 * @author morti
 */
public class Principal {
    
    
    public static void main(String[] args) {
    	FijoFactory fijoFactory = new FijoFactory();
        System.out.println(fijoFactory.crearMedico().calcularSueldo());
        TemporalFactory temporalFactory = new TemporalFactory();
        Colaborador aux=temporalFactory.crearColaborador();
        System.out.println(aux.calcularSueldo());
        
    }


}
