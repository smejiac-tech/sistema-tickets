package model;

public class Buseta extends Vehiculo {

    private final double tarifa = 8000;

    public Buseta(String placa, String ruta) {
        super(placa, ruta, 19);
    }

    public double getTarifa() {
        return tarifa;
    }
}