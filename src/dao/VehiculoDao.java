package dao;

import model.Vehiculo;
import java.io.FileWriter;
import java.io.IOException;

public class VehiculoDao {

    private final String archivo = "vehiculos.txt";

    public void guardarVehiculo(Vehiculo v) {
        try (FileWriter fw = new FileWriter(archivo, true)) {
            fw.write(v.getPlaca() + ";" + "\n");
        } catch (IOException e) {
            System.out.println("Error guardando vehiculo");
        }
    }
}