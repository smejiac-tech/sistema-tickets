<<<<<<< HEAD
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

=======
package model;

public class MicroBus extends Vehiculo {

    private final double tarifa = 10000;

>>>>>>> c232d867b0f3fc4feb36893e2f314a9119102c25
    public MicroBus(String placa, String ruta) {
        super(placa, ruta, 25);
    }

<<<<<<< HEAD
    @Override
    public double getTarifa() {
        return 10000;
    }

    @Override
    public String toString() {
        return "MicroBus{" +
                "placa='" + placa + '\'' +
                ", ruta='" + ruta + '\'' +
                ", capacidad=" + capacidadMaxima +
                '}';
=======
    public double getTarifa() {
        return tarifa;
>>>>>>> c232d867b0f3fc4feb36893e2f314a9119102c25
    }
}