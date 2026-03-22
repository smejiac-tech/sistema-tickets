
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class Bus extends Vehiculo {

    private final double tarifa = 15000;

    public Bus(String placa, String ruta) {
        super(placa, ruta, 45);
    }

 
    public double getTarifa() {
        return tarifa;
    }

    @Override
    public String toString() {
        String placa = null;
        String ruta = null;
        String capacidadMaxima = null;
        return "Bus{" +
                "placa='" + placa + '\'' +
                ", ruta='" + ruta + '\'' +
                ", capacidad=" + capacidadMaxima +
                '}';
    }
}