/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class MicroBus extends Vehiculo {

    private final double tarifa = 10000;

    public MicroBus(String placa, String ruta) {
        super(placa, ruta, 25);
    }

  
    public double getTarifa() {
        return tarifa;
    }

    @Override
    public String toString() {
        String placa = null;
        String ruta = null;
        String capacidadMaxima = null;
        return "MicroBus{" +
                "placa='" + placa + '\'' +
                ", ruta='" + ruta + '\'' +
                ", capacidad=" + capacidadMaxima +
                '}';
    }
}