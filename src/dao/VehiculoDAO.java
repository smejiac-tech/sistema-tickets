/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class VehiculoDAO {

    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void guardarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public List<Vehiculo> listarVehiculos() {
        return vehiculos;
    }

    public List<Vehiculo> cargarTodos() {
      return vehiculos;
    }
}

