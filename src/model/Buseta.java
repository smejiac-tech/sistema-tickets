<<<<<<< HEAD

package model;

/**
 *
 * @author ronal
 */
public class Buseta extends Vehiculo {

=======
package model;

public class Buseta extends Vehiculo {

    private final double tarifa = 8000;

>>>>>>> c232d867b0f3fc4feb36893e2f314a9119102c25
    public Buseta(String placa, String ruta) {
        super(placa, ruta, 19);
    }

<<<<<<< HEAD
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
=======
    public double getTarifa() {
        return tarifa;
    }
}
>>>>>>> c232d867b0f3fc4feb36893e2f314a9119102c25
