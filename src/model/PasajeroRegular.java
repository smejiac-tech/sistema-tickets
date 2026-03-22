package model;
 
public class PasajeroRegular extends Pasajero {
 
    public PasajeroRegular(String cedula, String nombre) {
        super(cedula, nombre);
    }
 
    @Override
    public double calcularDescuento() {
        return 0.0; // Sin descuento
    }
 
    @Override
    public String getTipo() {
        return "Regular";
    }
 
   
    public void imprimirDetalle() {
        System.out.println("=== PASAJERO ===");
        System.out.println("Tipo   : Regular (sin descuento)");
        System.out.println("Cedula : " + cedula);
        System.out.println("Nombre : " + nombre);
    }
}