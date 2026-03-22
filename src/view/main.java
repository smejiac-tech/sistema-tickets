package view;

import model.*;
import service.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VehiculoService vehiculoService = new VehiculoService();
        TicketService ticketService = new TicketService();
        EstadisticasService estadisticasService = new EstadisticasService();

        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE TICKETS ===");
            System.out.println("1. Registrar Vehiculo");
            System.out.println("2. Registrar Pasajero");
            System.out.println("3. Registrar Conductor");
            System.out.println("4. Vender Ticket");
            System.out.println("5. Listar Vehiculos");
            System.out.println("6. Listar Tickets");
            System.out.println("7. Ver Total Recaudado");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    registrarVehiculo(sc, vehiculoService);
                    break;

                case 2:
                    System.out.println("FUNCION EN CONSTRUCCION (equipo)");
                    break;

                case 3:
                    System.out.println("FUNCION EN CONSTRUCCION (equipo)");
                    break;

                case 4:
                    venderTicket(sc, vehiculoService, ticketService);
                    break;

                case 5:
                    listarVehiculos(vehiculoService);
                    break;

                case 6:
                    listarTickets(ticketService);
                    break;

                case 7:
                    double total = estadisticasService.totalRecaudado(ticketService.listar());
                    System.out.println("Total recaudado: $" + total);
                    break;
            }

        } while (opcion != 0);

        System.out.println("Sistema finalizado");
    }

    // ================= MÉTODOS =================

    public static void registrarVehiculo(Scanner sc, VehiculoService service) {

        System.out.println("Tipo: 1.Buseta 2.MicroBus 3.Bus");
        int tipo = sc.nextInt();

        System.out.print("Placa: ");
        String placa = sc.next();

        System.out.print("Ruta: ");
        String ruta = sc.next();

        Vehiculo v = null;

        switch (tipo) {
            case 1:
                v = new Buseta(placa, ruta);
                break;
            case 2:
                v = new MicroBus(placa, ruta) {
            @Override
            public void imprimirDetalle() {
            }
        };
                break;
            case 3:
                v = new Bus(placa, ruta) {};
                break;
        }

        if (v != null && service.agregarVehiculo(v)) {
            System.out.println("Vehiculo registrado");
        }
    }

    public static void venderTicket(Scanner sc, VehiculoService vs, TicketService ts) {

        if (vs.listar().isEmpty()) {
            System.out.println("No hay vehiculos");
            return;
        }

        Vehiculo v = vs.listar().get(0);

        System.out.println("Tipo pasajero: 1.Regular 2.Estudiante 3.Adulto Mayor");
        int tipo = sc.nextInt();

        System.out.print("Nombre pasajero: ");
        String nombre = sc.next();

        Pasajero p = null;

        switch (tipo) {
            case 1:
                p = new PasajeroRegular("1", nombre);
                break;
            case 2:
                p = new PasajeroEstudiante("2", nombre);
                break;
            case 3:
                p = new PasajeroAdultoMayor("3", nombre);
                break;
        }

        System.out.print("Origen: ");
        String origen = sc.next();

        System.out.print("Destino: ");
        String destino = sc.next();

        Ticket t = new Ticket(p, v, origen, destino);

        if (ts.venderTicket(t, v)) {
            System.out.println("Ticket vendido");
            t.imprimirDetalle();
        }
    }

    public static void listarVehiculos(VehiculoService vs) {

        for (Vehiculo v : vs.listar()) {
            System.out.println("Placa: " + v.getPlaca() +
                    " | Cupos: " + v.getCapacidadDisponible());
        }
    }

    public static void listarTickets(TicketService ts) {

        for (Ticket t : ts.listar()) {
            t.imprimirDetalle();
        }
    }

    private static class Buseta extends Vehiculo {

        public Buseta(String placa, String ruta) {
        }

        @Override
        public void imprimirDetalle() {
        }
    }
}