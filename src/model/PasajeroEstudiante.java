package model;

public class PasajeroEstudiante extends Pasajero {

    public PasajeroEstudiante(String cedula, String nombre) {
        super(cedula, nombre);
    }

    @Override
    public double calcularDescuento() {
        return 0.15;
    }

    @Override
    public void imprimirDetalle() {
        System.out.println("Pasajero Estudiante: " + nombre);
    }
}