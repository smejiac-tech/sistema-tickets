/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Reserva;

public class ReservaDAO {

    private List<Reserva> reservas = new ArrayList<>();

    public void guardar(Reserva r) {
        reservas.add(r);
    }

    public List<Reserva> listar() {
        return reservas;
    }

    public Reserva buscarPorCodigo(String codigo) {
        for (Reserva r : reservas) {
            if (r.getCodigo().equals(codigo)) {
                return r;
            }
        }
        return null;
    }
}