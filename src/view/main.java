package view;

import dao.RutaDAO;
import dao.VehiculoDAO;
import model.*;
import service.*;


/**
 *
 * @author ronal
 */
public class main {

    public class Main {

        public static void main(String[] args) {
            System.out.println("=== SISTEMA DE TRANSPORTE ===\n");

            // DAO
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

            // CREAR VEHICULOS
            Vehiculo v1 = new Bus("AAA111", r1);
            Vehiculo v2 = new Buseta("BBB222", r2);
            Vehiculo v3 = new MicroBus("CCC333", r1);

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
        }
    }
}

