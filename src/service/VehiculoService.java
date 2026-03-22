
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
 
import dao.VehiculoDAO;
import model.*;
import java.util.ArrayList;
import java.util.List;
 
public class VehiculoService {

    private VehiculoDAO vehiculoDAO;

    public VehiculoService(VehiculoDAO vehiculoDAO) {
        this.vehiculoDAO = vehiculoDAO;
    }

    public VehiculoService() {
    }

    public boolean registrarVehiculo(Vehiculo v) {

        for (Vehiculo veh : vehiculoDAO.listarVehiculos()) {
            if (veh.getPlaca().equals(v.getPlaca())) {

    public Iterable<Vehiculo> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean agregarVehiculo(Vehiculo v) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
