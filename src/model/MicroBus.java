package model;

public class MicroBus extends Vehiculo {

    private final double tarifa = 10000;

    public MicroBus(String placa, String ruta) {
        super(placa, ruta, 25);
    }

    public double getTarifa() {
        return tarifa;
    }
}