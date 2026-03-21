/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.ReservaDAO;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import model.EstadoReserva;
import model.Reserva;

public class ReservaService {

    private ReservaDAO reservaDAO;

    public ReservaService(ReservaDAO reservaDAO) {
        this.reservaDAO = reservaDAO;
    }

    public boolean crearReserva(Reserva r) {

        // VALIDAR CAPACIDAD
        if (!r.getVehiculo().hayCupos()) {
            return false;
        }

        // VALIDAR DUPLICADO
        for (Reserva res : reservaDAO.listar()) {
            if (res.getPasajero().equals(r.getPasajero()) &&
                res.getVehiculo().equals(r.getVehiculo()) &&
                res.getFechaViaje().equals(r.getFechaViaje()) &&
                res.getEstado() == EstadoReserva.ACTIVA) {
                return false;
            }
        }

        r.getVehiculo().subirPasajero();
        reservaDAO.guardar(r);
        return true;
    }

    public boolean cancelarReserva(String codigo) {
        Reserva r = reservaDAO.buscarPorCodigo(codigo);
        if (r != null && r.getEstado() == EstadoReserva.ACTIVA) {
            r.cancelar();
            return true;
        }
        return false;
    }

    public List<Reserva> listarActivas() {
        List<Reserva> activas = new ArrayList<>();
        for (Reserva r : reservaDAO.listar()) {
            if (r.getEstado() == EstadoReserva.ACTIVA) {
                activas.add(r);
            }
        }
        return activas;
    }

    public int verificarVencidas() {
        int contador = 0;

        for (Reserva r : reservaDAO.listar()) {
            if (r.getEstado() == EstadoReserva.ACTIVA) {

                long horas = ChronoUnit.HOURS.between(r.getFechaCreacion(), LocalDateTime.now());

                if (horas > 24) {
                    r.cancelar();
                    contador++;
                }
            }
        }

        return contador;
    }
}
