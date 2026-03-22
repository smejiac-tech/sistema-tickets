package model;

public class Conductor extends Persona {

    private String licencia;
    private String categoria;

    public Conductor(String cedula, String nombre, String licencia, String categoria) {
        super(cedula, nombre);
        this.licencia = licencia;
        this.categoria = categoria;
    }

    public String getLicencia() {
        return licencia;
    }

    public String getCategoria() {
        return categoria;
    }

    // Validación requerida por el taller: no puede asignarse si no tiene licencia
    public boolean tieneLicencia() {
        return licencia != null && !licencia.trim().isEmpty();
    }

    
    public void imprimirDetalle() {
        System.out.println("=== CONDUCTOR ===");
        System.out.println("Cedula    : " + cedula);
        System.out.println("Nombre    : " + nombre);
        System.out.println("Licencia  : " + licencia);
        System.out.println("Categoria : " + categoria);
    }
}