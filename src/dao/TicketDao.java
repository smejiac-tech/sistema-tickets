package dao;

import model.Ticket;
import java.io.FileWriter;
import java.io.IOException;

public class TicketDao {

    private final String archivo = "tickets.txt";

    public void guardar(Ticket t) {
        try (FileWriter fw = new FileWriter(archivo, true)) {
            fw.write("Ticket generado\n");
        } catch (IOException e) {
            System.out.println("Error guardando ticket");
        }
    }
}