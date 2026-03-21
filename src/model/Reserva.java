/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDateTime;

public class Reserva {
    private String codigo;
    private String pasajero;
    private Vehiculo vehiculo;
    private LocalDateTime fechaCreacion;
    private String fechaViaje;
    private EstadoReserva estado;

    public Reserva(String codigo, String pasajero, Vehiculo vehiculo, String fechaViaje) {
        this.codigo = codigo;
        this.pasajero = pasajero;
        this.vehiculo = vehiculo;
        this.fechaViaje = fechaViaje;
        this.fechaCreacion = LocalDateTime.now();
        this.estado = EstadoReserva.ACTIVA;
    }

    public String getCodigo() { return codigo; }
    public String getPasajero() { return pasajero; }
    public Vehiculo getVehiculo() { return vehiculo; }
    public EstadoReserva getEstado() { return estado; }
    public LocalDateTime getFechaCreacion() { return fechaCreacion; }
    public String getFechaViaje() { return fechaViaje; }

    public void cancelar() {
        this.estado = EstadoReserva.CANCELADA;
    }

    public void convertir() {
        this.estado = EstadoReserva.CONVERTIDA;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "codigo='" + codigo + '\'' +
                ", pasajero='" + pasajero + '\'' +
                ", vehiculo=" + vehiculo.getPlaca() +
                ", fechaViaje='" + fechaViaje + '\'' +
                ", estado=" + estado +
                '}';
    }
}
