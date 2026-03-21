/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ronal
 */

public class Bus extends Vehiculo {
    public Bus(String placa, Ruta ruta) {
        super(placa, ruta, 45, 15000);
    }
    @Override
public String toString() {
    return "Bus{" +
            "placa='" + placa + '\'' +
            ", ruta=" + ruta +
            ", capacidad=" + capacidadMaxima +
            '}';
}
}
