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
    public String getTipo() {
        return "Estudiante";
    }
 

    public void imprimirDetalle() {
        System.out.println("=== PASAJERO ===");
        System.out.println("Tipo   : Estudiante (15% descuento)");
        System.out.println("Cedula : " + cedula);
        System.out.println("Nombre : " + nombre);
    }
}