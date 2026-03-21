package model;

public abstract class Vehiculo {
    protected String placa;
    protected String ruta;
    protected int capacidadMaxima;
    protected int pasajerosActuales;

    public Vehiculo(String placa, String ruta, int capacidadMaxima) {
        this.placa = placa;
        this.ruta = ruta;
        this.capacidadMaxima = capacidadMaxima;
        this.pasajerosActuales = 0;
    }

    public boolean hayCupos() {
        return pasajerosActuales < capacidadMaxima;
    }

    public void subirPasajero() {
        if (hayCupos()) {
            pasajerosActuales++;
        }
    }

    public int getCapacidadDisponible() {
        return capacidadMaxima - pasajerosActuales;
    }

    public String getPlaca() {
        return placa;
    }

    String getRuta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}