package model;

public class Conductor extends Persona {

    private String licencia;
    private String categoria;

    public Conductor(String cedula, String nombre, String licencia, String categoria) {
        super(cedula, nombre);
        this.licencia = licencia;
        this.categoria = categoria;
    }

    public boolean tieneLicencia() {
        return licencia != null && !licencia.isEmpty();
    }

    @Override
    public void imprimirDetalle() {
        System.out.println("Conductor: " + nombre + " - Cedula: " + cedula +
                " - Licencia: " + licencia + " - Categoria: " + categoria);
    }
}