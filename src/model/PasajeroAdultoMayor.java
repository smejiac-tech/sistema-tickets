package model;
 
public class PasajeroAdultoMayor extends Pasajero {
 
    public PasajeroAdultoMayor(String cedula, String nombre) {
        super(cedula, nombre);
    }
 
    @Override
    public double calcularDescuento() {
        return 0.30; 
    }
 
    @Override
    public String getTipo() {
        return "AdultoMayor";
    }
 
    @Override
    public void imprimirDetalle() {
        System.out.println("=== PASAJERO ===");
        System.out.println("Tipo   : Adulto Mayor (30% descuento)");
        System.out.println("Cedula : " + cedula);
        System.out.println("Nombre : " + nombre);
    }
}