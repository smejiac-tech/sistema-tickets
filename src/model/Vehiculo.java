/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ronal
 */
public abstract class Vehiculo {
    
    protected String placa;
    protected Ruta ruta;
    protected int capacidadMaxima;
    protected int pasajerosActuales;
    protected double tarifaBase;

    public Vehiculo(String placa, Ruta ruta, int capacidadMaxima, double tarifaBase) {
        this.placa = placa;
        this.ruta = ruta;
        this.capacidadMaxima = capacidadMaxima;
        this.tarifaBase = tarifaBase;
        this.pasajerosActuales = 0;
    }

    public boolean hayCupos() {
        return pasajerosActuales < capacidadMaxima;
    }
    public String getPlaca() {
    return placa;
}

public void setPlaca(String placa) {
    this.placa = placa;
}

public Ruta getRuta() {
    return ruta;
}

public void setRuta(Ruta ruta) {
    this.ruta = ruta;
}

public int getCapacidadMaxima() {
    return capacidadMaxima;
}

public void setCapacidadMaxima(int capacidadMaxima) {
    this.capacidadMaxima = capacidadMaxima;
}

public int getPasajerosActuales() {
    return pasajerosActuales;
}

public void setPasajerosActuales(int pasajerosActuales) {
    this.pasajerosActuales = pasajerosActuales;
}

public double getTarifaBase() {
    return tarifaBase;
}

public void setTarifaBase(double tarifaBase) {
    this.tarifaBase = tarifaBase;
}
@Override
public String toString() {
    return "Vehiculo{" +
            "placa='" + placa + '\'' +
            ", ruta=" + ruta +
            ", capacidadMaxima=" + capacidadMaxima +
            ", pasajerosActuales=" + pasajerosActuales +
            ", tarifaBase=" + tarifaBase +
            '}';
}
}
