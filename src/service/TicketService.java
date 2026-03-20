package service;

import dao.TicketDao;
import model.Ticket;
import model.Vehiculo;

public class TicketService {

    private TicketDao dao = new TicketDao();

    public boolean venderTicket(Ticket t, Vehiculo v) {

        if (!v.hayCupos()) {
            System.out.println("Vehiculo lleno");
            return false;
        }

        v.subirPasajero();
        dao.guardar(t);
        return true;
    }
}