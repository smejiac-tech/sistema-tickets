package dao;
 
import model.Conductor;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
 
public class ConductorDao {

    private final String ARCHIVO = "conductores.txt";
 
    public void guardar(Conductor c) {
        try (FileWriter fw = new FileWriter(ARCHIVO, true)) {
            fw.write(c.getCedula() + ";"
                    + c.getNombre() + ";"
                    + c.getLicencia() + ";"
                    + c.getCategoria() + "\n");
        } catch (IOException e) {
            System.out.println("Error al guardar conductor: " + e.getMessage());
        }
    }

    public List<Conductor> cargarTodos() {
        List<Conductor> lista = new ArrayList<>();
        File archivo = new File(ARCHIVO);
 
        if (!archivo.exists()) {
            return lista;
        }
 
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) continue;
 
                String[] partes = linea.split(";");
                if (partes.length >= 4) {
                    String cedula    = partes[0];
                    String nombre    = partes[1];
                    String licencia  = partes[2];
                    String categoria = partes[3];
                    lista.add(new Conductor(cedula, nombre, licencia, categoria));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar conductores: " + e.getMessage());
        }
 
        return lista;
    }
}