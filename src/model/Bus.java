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

public class Bus extends Vehiculo {

=======
package model;

public class Bus extends Vehiculo {

    private final double tarifa = 15000;

>>>>>>> c232d867b0f3fc4feb36893e2f314a9119102c25
    public Bus(String placa, String ruta) {
        super(placa, ruta, 45);
    }

<<<<<<< HEAD
    @Override
    public double getTarifa() {
        return 15000;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "placa='" + placa + '\'' +
                ", ruta='" + ruta + '\'' +
                ", capacidad=" + capacidadMaxima +
                '}';
    }
}
=======
    public double getTarifa() {
        return tarifa;
    }
}
>>>>>>> c232d867b0f3fc4feb36893e2f314a9119102c25
