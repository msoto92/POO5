/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo5;

/**
 *
 * @author Miguel
 */
public class Automovil extends Vehiculo {

    public Automovil(int pasajeros, double velocidad)
    {
        super(pasajeros, velocidad);
    }
    
    
    @Override
    public void pintar(int posicion) {
        espacios(posicion + 4);
        System.out.println("_____");
        espacios(posicion + 1);
        System.out.println("__/__|__\\\\___");
        espacios(posicion);
        System.out.println("|_ _____ __|");
        espacios(posicion);
        System.out.println(" O O");
    }

}
