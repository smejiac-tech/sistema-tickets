package model;

import java.time.LocalDate;

public class Ticket implements Calculable, Imprimible {

    private Pasajero pasajero;
    private Vehiculo vehiculo;
    private LocalDate fecha;
    private String origen;
    private String destino;

    public Ticket(Pasajero pasajero, Vehiculo vehiculo, String origen, String destino) {
        this.pasajero = pasajero;
        this.vehiculo = vehiculo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = LocalDate.now();
    }

    @Override
    public double calcularTotal() {
        double tarifaBase = 0;

        if (vehiculo instanceof Buseta) {
            tarifaBase = ((Buseta) vehiculo).getTarifa();
        } else if (vehiculo instanceof MicroBus) {
            tarifaBase = ((MicroBus) vehiculo).getTarifa();
        } else if (vehiculo instanceof Bus) {
            tarifaBase = ((Bus) vehiculo).getTarifa();
        }

        double descuento = pasajero.calcularDescuento();
        return tarifaBase - (tarifaBase * descuento);
    }

    @Override
    public void imprimirDetalle() {
        System.out.println("=== TICKET ===");
        pasajero.imprimirDetalle();
        System.out.println("Vehiculo: " + vehiculo.getPlaca());
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Fecha: " + fecha);
        System.out.println("Total: $" + calcularTotal());
    }
}