
package model;

/**
 *
 * @author ronal
 */
public class Buseta extends Vehiculo {

    public Buseta(String placa, String ruta) {
        super(placa, ruta, 19);
    }

    @Override
    public double getTarifa() {
        return 8000;
    }

    @Override
    public String toString() {
        return "Buseta{" +
                "placa='" + placa + '\'' +
                ", ruta='" + ruta + '\'' +
                ", capacidad=" + capacidadMaxima +
                '}';
    }
}
