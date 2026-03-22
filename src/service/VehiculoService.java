<<<<<<< HEAD
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

    public boolean registrarVehiculo(Vehiculo v) {

        for (Vehiculo veh : vehiculoDAO.listarVehiculos()) {
            if (veh.getPlaca().equals(v.getPlaca())) {
=======
package service;

import dao.VehiculoDao;
import model.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class VehiculoService {

    private List<Vehiculo> lista = new ArrayList<>();
    private VehiculoDao dao = new VehiculoDao();

    public boolean agregarVehiculo(Vehiculo v) {

        for (Vehiculo veh : lista) {
            if (veh.getPlaca().equals(v.getPlaca())) {
                System.out.println("Vehiculo con esa placa ya existe");
>>>>>>> c232d867b0f3fc4feb36893e2f314a9119102c25
                return false;
            }
        }

<<<<<<< HEAD
        vehiculoDAO.guardarVehiculo(v);
        return true;
    }
=======
        lista.add(v);
        dao.guardarVehiculo(v);
        return true;
    }

    public List<Vehiculo> listar() {
        return lista;
    }
>>>>>>> c232d867b0f3fc4feb36893e2f314a9119102c25
}