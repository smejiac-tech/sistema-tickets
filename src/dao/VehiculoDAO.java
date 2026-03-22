/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Vehiculo;

public class VehiculoDAO {

    private List<Vehiculo> vehiculos;

    public VehiculoDAO() {
        vehiculos = new ArrayList<>();
    }

    // Guardar vehículo
    public void guardarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    // Listar todos los vehículos
    public List<Vehiculo> listarVehiculos() {
        return vehiculos;
    }

    // Buscar vehículo por placa
    public Vehiculo buscarPorPlaca(String placa) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }
}

