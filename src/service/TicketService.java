package service;
 
import dao.ConductorDao;
import dao.PasajeroDao;
import dao.TicketDao;
import model.*;
 
import java.util.ArrayList;
import java.util.List;
 
public class TicketService {
 
    private TicketDao ticketDao       = new TicketDao();
    private PasajeroDao pasajeroDao   = new PasajeroDao();
    private ConductorDao conductorDao = new ConductorDao();

    private List<Ticket>    tickets    = new ArrayList<>();
    private List<Pasajero>  pasajeros  = new ArrayList<>();
    private List<Conductor> conductores = new ArrayList<>();
 
    public void cargarDatos() {
        pasajeros   = pasajeroDao.cargarTodos();
        conductores = conductorDao.cargarTodos();

        System.out.println("  Pasajeros cargados   : " + pasajeros.size());
        System.out.println("  Conductores cargados : " + conductores.size());
    }
 
    public boolean registrarPasajero(Pasajero p) {
        for (Pasajero existente : pasajeros) {
            if (existente.getCedula().equals(p.getCedula())) {
                System.out.println("Ya existe un pasajero con cedula " + p.getCedula());
                return false;
            }
        }
        pasajeros.add(p);
        pasajeroDao.guardar(p);
        return true;
    }
 
    public List<Pasajero> listarPasajeros() {
        return pasajeros;
    }

    public Pasajero buscarPasajeroPorCedula(String cedula) {
        for (Pasajero p : pasajeros) {
            if (p.getCedula().equals(cedula)) {
                return p;
            }
        }
        return null;
    }
 
    public boolean registrarConductor(Conductor c) {

        if (!c.tieneLicencia()) {
            System.out.println("Error: el conductor no tiene licencia registrada.");
            return false;
        }
        for (Conductor existente : conductores) {
            if (existente.getCedula().equals(c.getCedula())) {
                System.out.println("Ya existe un conductor con cedula " + c.getCedula());
                return false;
            }
        }
        conductores.add(c);
        conductorDao.guardar(c);
        return true;
    }
 
    public List<Conductor> listarConductores() {
        return conductores;
    }

    public boolean venderTicket(Ticket t, Vehiculo v) {
        if (!v.hayCupos()) {
            System.out.println("Venta rechazada: el vehiculo " + v.getPlaca() + " no tiene cupos disponibles.");
            return false;
        }
 
        v.subirPasajero();
        tickets.add(t);
        ticketDao.guardar(t);
        return true;
    }
 
    public List<Ticket> listarTickets() {
        return tickets;
    }
}