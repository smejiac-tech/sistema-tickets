/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Vehiculo;
import dao.VehiculoDAO;

/**
 *
 * @author ronal
 */
public class VehiculoService {
    private VehiculoDAO vehiculoDAO;

    public VehiculoService(VehiculoDAO vehiculoDAO) {
        this.vehiculoDAO = vehiculoDAO;
    }

    public boolean registrarVehiculo(Vehiculo v) {

        for (Vehiculo vehiculo : vehiculoDAO.listarVehiculos()) {
            if (vehiculo.getPlaca().equals(v.getPlaca())) {
                return false;
            }
        }

        vehiculoDAO.guardarVehiculo(v);
        return true;
    }
}
