package view;

import dao.ReservaDAO;
import dao.RutaDAO;
import dao.VehiculoDAO;
import model.*;
import service.*;


/**
 *
 * @author ronal
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE TRANSPORTE ===\n");

      
        RutaDAO rutaDAO = new RutaDAO();
        VehiculoDAO vehiculoDAO = new VehiculoDAO();

        // SERVICES
        RutaService rutaService = new RutaService(rutaDAO);
        VehiculoService vehiculoService = new VehiculoService(vehiculoDAO);

        // CREAR RUTAS
        Ruta r1 = new Ruta("R1", "Valledupar", "Bogotá", 850, 600);
        Ruta r2 = new Ruta("R2", "Valledupar", "Santa Marta", 250, 300);

        rutaService.registrarRuta(r1);
        rutaService.registrarRuta(r2);

        System.out.println("Rutas registradas correctamente.\n");

        // CREAR VEHICULOS (USANDO STRING)
        Vehiculo v1 = new Bus("AAA111", "Valledupar-Bogotá");
        Vehiculo v2 = new Buseta("BBB222", "Valledupar-Santa Marta");
        Vehiculo v3 = new MicroBus("CCC333", "Valledupar-Bogotá");

        // REGISTRAR VEHICULOS
        System.out.println("Registrando vehículos...\n");

        System.out.println("Vehículo 1: " + vehiculoService.registrarVehiculo(v1));
        System.out.println("Vehículo 2: " + vehiculoService.registrarVehiculo(v2));
        System.out.println("Vehículo 3: " + vehiculoService.registrarVehiculo(v3));

        // INTENTO DUPLICADO
        System.out.println("\nIntentando registrar vehículo repetido...");
        System.out.println("Resultado: " + vehiculoService.registrarVehiculo(v1));

        // MOSTRAR VEHICULOS
        System.out.println("\n=== LISTA DE VEHÍCULOS ===");

        for (Vehiculo v : vehiculoDAO.listarVehiculos()) {
            System.out.println(v);
        }

        // VALIDAR CUPOS
        System.out.println("\n=== VALIDACIÓN DE CUPOS ===");
        System.out.println("¿Vehículo 1 tiene cupos? " + v1.hayCupos());
        
        ReservaDAO reservaDAO = new ReservaDAO();
ReservaService reservaService = new ReservaService(reservaDAO);

// CREAR RESERVA
Reserva res1 = new Reserva("RES1", "Juan", v1, "2026-03-25");

System.out.println("\nCreando reserva...");
System.out.println(reservaService.crearReserva(res1));

// LISTAR
System.out.println("\nReservas activas:");
for (Reserva r : reservaService.listarActivas()) {
    System.out.println(r);
}

// VERIFICAR VENCIDAS
System.out.println("\nReservas vencidas canceladas: " + reservaService.verificarVencidas());
    }
}
