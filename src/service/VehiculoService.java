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
 
    private List<Vehiculo> lista = new ArrayList<>();
    private VehiculoDAO dao = new VehiculoDAO();

    public VehiculoService(VehiculoDAO vehiculoDAO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
    /**
     * Carga vehículos desde el archivo al iniciar el sistema.
     * El Lider debe implementar VehiculoDao.cargarTodos() también.
     */
    public void cargarDatos() {
        lista = dao.cargarTodos();
        System.out.println("  Vehiculos cargados   : " + lista.size());
    }
 
    public boolean agregarVehiculo(Vehiculo v) {
        for (Vehiculo veh : lista) {
            if (veh.getPlaca().equals(v.getPlaca())) {
                System.out.println("Error: ya existe un vehiculo con la placa " + v.getPlaca());
                return false;
            }
        }
        lista.add(v);
        dao.guardarVehiculo(v);
        return true;
    }
 
    public List<Vehiculo> listar() {
        return lista;
    }
 
    public Vehiculo buscarPorPlaca(String placa) {
        for (Vehiculo v : lista) {
            if (v.getPlaca().equals(placa)) return v;
        }
        return null;
    }

    public String registrarVehiculo(Vehiculo v1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}