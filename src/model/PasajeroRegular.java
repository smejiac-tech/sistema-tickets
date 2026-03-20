package model;

public class PasajeroRegular extends Pasajero {

    public PasajeroRegular(String cedula, String nombre) {
        super(cedula, nombre);
    }

    @Override
    public double calcularDescuento() {
        return 0.0;
    }

    @Override
    public void imprimirDetalle() {
        System.out.println("Pasajero Regular: " + nombre);
    }
}