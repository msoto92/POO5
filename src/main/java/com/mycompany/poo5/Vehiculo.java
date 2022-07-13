/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo5;

/**
 *
 * @author Miguel
 */
public abstract class Vehiculo {

    protected int pasajeros;
    protected double velocidad;

    public Vehiculo(int pasajeros, double velocidad) {
        this.pasajeros = pasajeros;
        this.velocidad = velocidad;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int posicion(int tiempo) {
        return (int) (tiempo * velocidad);
    }

    public void espacios(int espacios) {
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
    }
    
    public abstract void pintar(int posicion);
}
