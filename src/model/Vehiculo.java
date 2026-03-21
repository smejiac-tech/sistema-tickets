/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Imprimible;

public abstract class Vehiculo implements Imprimible {

    protected String placa;
    protected String ruta;
    protected int capacidadMaxima;
    protected int pasajerosActuales;

    public Vehiculo(String placa, String ruta, int capacidadMaxima) {
        this.placa = placa;
        this.ruta = ruta;
        this.capacidadMaxima = capacidadMaxima;
        this.pasajerosActuales = 0;
    }
    public boolean hayCupos() {
        return pasajerosActuales < capacidadMaxima;
    }

    public void subirPasajero() {
        if (hayCupos()) {
            pasajerosActuales++;
        }
    }

    public int getCapacidadDisponible() {
        return capacidadMaxima - pasajerosActuales;
    }

    public String getPlaca() { return placa; }
    public String getRuta()  { return ruta;  }

    // Cada subclase devuelve su tarifa base
    public abstract double getTarifa();

    public void imprimirDetalle() {
        System.out.println("Vehiculo : " + getClass().getSimpleName());
        System.out.println("Placa    : " + placa);
        System.out.println("Ruta     : " + ruta);
        System.out.println("Capacidad: " + capacidadMaxima);
        System.out.println("Cupos    : " + getCapacidadDisponible());
        System.out.printf ("Tarifa   : $%.0f%n", getTarifa());
    }
}