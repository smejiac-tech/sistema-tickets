package view;

import model.*;
import service.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VehiculoService vehiculoService = new VehiculoService();
        TicketService ticketService = new TicketService();

        int opcion;

        do {
            System.out.println("1. Registrar Buseta");
            System.out.println("2. Vender Ticket");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Placa:");
                    String placa = sc.next();

                    System.out.println("Ruta:");
                    String ruta = sc.next();

                    Vehiculo v = new Buseta(placa, ruta);
                    vehiculoService.agregarVehiculo(v);
                    break;

                case 2:
                    if (vehiculoService.listar().isEmpty()) {
                        System.out.println("No hay vehiculos");
                        break;
                    }

                    Vehiculo veh = vehiculoService.listar().get(0);

                    Pasajero p = new PasajeroRegular("123", "Juan");

                    Ticket t = new Ticket(p, veh, "Valledupar", "Bogota");

                    ticketService.venderTicket(t, veh);

                    t.imprimirDetalle();
                    break;
            }

        } while (opcion != 0);
    }
}