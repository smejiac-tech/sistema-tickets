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
}