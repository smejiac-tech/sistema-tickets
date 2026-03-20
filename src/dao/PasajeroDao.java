package dao;

import model.Pasajero;
import java.io.FileWriter;
import java.io.IOException;

public class PasajeroDao {

    private final String archivo = "pasajeros.txt";

    public void guardar(Pasajero p) {
        try (FileWriter fw = new FileWriter(archivo, true)) {
            fw.write(p.getCedula() + ";" + p.getNombre() + "\n");
        } catch (IOException e) {
            System.out.println("Error guardando pasajero");
        }
    }
}