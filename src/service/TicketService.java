package service;

import dao.TicketDao;
import model.Ticket;
import model.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class TicketService {

    private TicketDao dao = new TicketDao();
    private List<Ticket> lista = new ArrayList<>();

    public boolean venderTicket(Ticket t, Vehiculo v) {

        if (!v.hayCupos()) {
            System.out.println("Vehiculo lleno");
            return false;
        }

        v.subirPasajero();
        lista.add(t); // 🔥 IMPORTANTE
        dao.guardar(t);

        return true;
    }

    public List<Ticket> listar() {
        return lista;
    }
}