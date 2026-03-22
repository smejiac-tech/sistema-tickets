package dao;
 
import model.*;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
 
public class TicketDao {
 
    private final String ARCHIVO = "tickets.txt";

    public void guardar(Ticket t) {
        try (FileWriter fw = new FileWriter(ARCHIVO, true)) {
            fw.write(
                t.getPasajero().getCedula()  + ";"
              + t.getPasajero().getNombre()  + ";"
              + t.getPasajero().getTipo()    + ";"
              + t.getVehiculo().getPlaca()   + ";"
              + t.getOrigen()                + ";"
              + t.getDestino()               + ";"
              + t.getFecha().toString()      + ";"
              + t.calcularTotal()            + "\n"
            );
        } catch (IOException e) {
            System.out.println("Error al guardar ticket: " + e.getMessage());
        }
    }
 
    public List<String> cargarLineas() {
        List<String> lineas = new ArrayList<>();
        File archivo = new File(ARCHIVO);
 
        if (!archivo.exists()) {
            return lineas;
        }
 
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (!linea.isEmpty()) {
                    lineas.add(linea);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar tickets: " + e.getMessage());
        }
 
        return lineas;
    }
}