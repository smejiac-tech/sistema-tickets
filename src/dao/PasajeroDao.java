package dao;
 
import model.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
 
public class PasajeroDao {
 
    private final String ARCHIVO = "pasajeros.txt";

    public void guardar(Pasajero p) {
        try (FileWriter fw = new FileWriter(ARCHIVO, true)) {
            fw.write(p.getCedula() + ";"
                    + p.getNombre() + ";"
                    + p.getTipo() + "\n");
        } catch (IOException e) {
            System.out.println("Error al guardar pasajero: " + e.getMessage());
        }
    }

    public List<Pasajero> cargarTodos() {
        List<Pasajero> lista = new ArrayList<>();
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
                if (partes.length >= 3) {
                    String cedula = partes[0];
                    String nombre = partes[1];
                    String tipo   = partes[2];
 
                    Pasajero p = null;
                    switch (tipo) {
                        case "Regular":
                            p = new PasajeroRegular(cedula, nombre);
                            break;
                        case "Estudiante":
                            p = new PasajeroEstudiante(cedula, nombre);
                            break;
                        case "AdultoMayor":
                            p = new PasajeroAdultoMayor(cedula, nombre);
                            break;
                        default:
                            System.out.println("Tipo de pasajero desconocido: " + tipo);
                    }
 
                    if (p != null) {
                        lista.add(p);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar pasajeros: " + e.getMessage());
        }
 
        return lista;
    }
}