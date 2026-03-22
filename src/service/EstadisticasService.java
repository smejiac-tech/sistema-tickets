package service;
 
import model.*;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
 
public class EstadisticasService {

    public double totalRecaudado(List<Ticket> tickets) {
        double total = 0;
        for (Ticket t : tickets) {
            total += t.calcularTotal();
        }
        return total;
    }

    public void pasajerosPorTipo(List<Ticket> tickets) {
        int regulares    = 0;
        int estudiantes  = 0;
        int adultosMayor = 0;
 
        for (Ticket t : tickets) {
            String tipo = t.getPasajero().getTipo();
            switch (tipo) {
                case "Regular":     regulares++;    break;
                case "Estudiante":  estudiantes++;  break;
                case "AdultoMayor": adultosMayor++; break;
            }
        }
 
        System.out.println("=== PASAJEROS POR TIPO ===");
        System.out.println("Regular     : " + regulares);
        System.out.println("Estudiante  : " + estudiantes);
        System.out.println("Adulto Mayor: " + adultosMayor);
    }

    public String vehiculoConMasTickets(List<Ticket> tickets) {
        if (tickets.isEmpty()) {
            return null;
        }

        Map<String, Integer> conteo = new HashMap<>();
        for (Ticket t : tickets) {
            String placa = t.getVehiculo().getPlaca();
            conteo.put(placa, conteo.getOrDefault(placa, 0) + 1);
        }

        String placaMax = null;
        int maxTickets  = 0;
        for (Map.Entry<String, Integer> entrada : conteo.entrySet()) {
            if (entrada.getValue() > maxTickets) {
                maxTickets = entrada.getValue();
                placaMax   = entrada.getKey();
            }
        }
 
        return placaMax;
    }

    public void mostrarReporteCompleto(List<Ticket> tickets) {
        System.out.println("\n========== REPORTE DE ESTADISTICAS ==========");
 
        if (tickets.isEmpty()) {
            System.out.println("No hay tickets vendidos aun.");
            System.out.println("=============================================");
            return;
        }
 
        System.out.printf("Total recaudado : $%.0f%n", totalRecaudado(tickets));
        System.out.println("Total tickets   : " + tickets.size());
        System.out.println();
        pasajerosPorTipo(tickets);
 
        String placaTop = vehiculoConMasTickets(tickets);
        if (placaTop != null) {
            System.out.println();
            System.out.println("=== VEHICULO CON MAS TICKETS ===");
            int count = 0;
            for (Ticket t : tickets) {
                if (t.getVehiculo().getPlaca().equals(placaTop)) count++;
            }
            System.out.println("Placa   : " + placaTop);
            System.out.println("Tickets : " + count);
        }
 
        System.out.println("=============================================");
    }
        public void contarTiposPasajeros(List<Ticket> tickets) {

        int regular = 0;
        int estudiante = 0;
        int adulto = 0;

        for (Ticket t : tickets) {
        Pasajero p = t.getPasajero();

        if (p instanceof PasajeroRegular) regular++;
        if (p instanceof PasajeroEstudiante) estudiante++;
        if (p instanceof PasajeroAdultoMayor) adulto++;
        }

        System.out.println("Pasajeros Regular: " + regular);
        System.out.println("Pasajeros Estudiante: " + estudiante);
        System.out.println("Pasajeros Adulto Mayor: " + adulto);
    }
        public void vehiculoMasVendido(List<Ticket> tickets) {

        if (tickets.isEmpty()) {
            System.out.println("No hay tickets");
            return;
        }

        Vehiculo mejor = null;
        int max = 0;

        for (Ticket t : tickets) {

            Vehiculo v = t.getVehiculo();
            int contador = 0;

            for (Ticket t2 : tickets) {
                if (t2.getVehiculo().getPlaca().equals(v.getPlaca())) {
                    contador++;
                }
            }

            if  (contador > max) {
                max = contador;
                mejor = v;
            }
        }

        if (mejor != null) {
        System.out.println("Vehiculo con mas ventas: " + mejor.getPlaca());
        System.out.println("Tickets vendidos: " + max);
        }
    }
}