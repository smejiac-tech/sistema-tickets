package model;

public class Bus extends Vehiculo {

    private final double tarifa = 15000;

    public Bus(String placa, String ruta) {
        super(placa, ruta, 45);
    }

    public double getTarifa() {
        return tarifa;
    }
}