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
 
    public Pasajero getPasajero() {
        return pasajero;
    }
 
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
 
    public LocalDate getFecha() {
        return fecha;
    }
 
    public String getOrigen() {
        return origen;
    }
 
    public String getDestino() {
        return destino;
    }
 
    private double getTarifaBase() {
        if (vehiculo instanceof Buseta)   return ((Buseta)   vehiculo).getTarifa();
        if (vehiculo instanceof MicroBus) return ((MicroBus) vehiculo).getTarifa();
        if (vehiculo instanceof Bus)      return ((Bus)      vehiculo).getTarifa();
        return 0;
    }
 
    @Override
    public double calcularTotal() {
        double tarifa = getTarifaBase();
        double descuento = pasajero.calcularDescuento();
        return tarifa - (tarifa * descuento);
    }
 
    @Override
    public void imprimirDetalle() {
        System.out.println("=========== TICKET ===========");
        System.out.println("Pasajero : " + pasajero.getNombre()
                + " (" + pasajero.getTipo() + ")");
        System.out.println("Cedula   : " + pasajero.getCedula());
        System.out.println("Vehiculo : " + vehiculo.getPlaca()
                + " | Ruta: " + vehiculo.getRuta());
        System.out.println("Origen   : " + origen);
        System.out.println("Destino  : " + destino);
        System.out.println("Fecha    : " + fecha);
        System.out.printf("Tarifa   : $%.0f%n", getTarifaBase());
        System.out.printf("Descuento: %.0f%%%n", pasajero.calcularDescuento() * 100);
        System.out.printf("TOTAL    : $%.0f%n", calcularTotal());
        System.out.println("==============================");
    }
}
 