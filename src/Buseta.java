
package model;

import model.Vehiculo;

/**
 *
 * @author ronal
 */
public abstract class Buseta extends Vehiculo {



    private final double tarifa = 8000;


    public Buseta(String placa, String ruta) {
        super(placa, ruta, 19);
    }


  
    public double getTarifa() {
        return 8000;
    }

   
    public String toString() {
        String placa = null;
        String ruta = null;
        String capacidadMaxima = null;
        return "Buseta{" +
                "placa='" + placa + '\'' +
                ", ruta='" + ruta + '\'' +
                ", capacidad=" + capacidadMaxima +
                '}';
    }
}

    public double getTarifa() {
    double tarifa = 0;
        return tarifa;
    }

