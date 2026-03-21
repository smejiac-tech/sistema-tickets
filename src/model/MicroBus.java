/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ronal
 */
public class MicroBus extends Vehiculo {
    public MicroBus(String placa, Ruta ruta) {
        super(placa, ruta, 25, 10000);
    }
    @Override
public String toString() {
    return "MicroBus{" +
            "placa='" + placa + '\'' +
            ", ruta=" + ruta +
            ", capacidad=" + capacidadMaxima +
            '}';
}
}

