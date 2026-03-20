package service;

import model.Ticket;
import java.util.List;

public class EstadisticasService {

    public double totalRecaudado(List<Ticket> tickets) {

        double total = 0;

        for (Ticket t : tickets) {
            total += t.calcularTotal();
        }

        return total;
    }
}