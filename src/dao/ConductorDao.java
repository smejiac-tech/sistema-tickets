package dao;

import model.Conductor;
import java.io.FileWriter;
import java.io.IOException;

public class ConductorDao {

    private final String archivo = "conductores.txt";

    public void guardar(Conductor c) {
        try (FileWriter fw = new FileWriter(archivo, true)) {
            fw.write(c.getCedula() + ";" + c.getNombre() + "\n");
        } catch (IOException e) {
            System.out.println("Error guardando conductor");
        }
    }
}