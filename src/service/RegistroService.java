package service;

import java.util.Scanner;

import dao.PasajeroDao;
import dao.ConductorDao;
import model.*;

public class RegistroService {

    private PasajeroDao pasajeroDao = new PasajeroDao();
    private ConductorDao conductorDao = new ConductorDao();

    public void registrarPasajero(Scanner sc) {

        System.out.println("Tipo pasajero: 1.Regular 2.Estudiante 3.Adulto Mayor");
        int tipo = sc.nextInt();

        System.out.print("Cedula: ");
        String cedula = sc.next();

        System.out.print("Nombre: ");
        String nombre = sc.next();

        Pasajero p = null;

        switch (tipo) {
            case 1:
                p = new PasajeroRegular(cedula, nombre);
                break;
            case 2:
                p = new PasajeroEstudiante(cedula, nombre);
                break;
            case 3:
                p = new PasajeroAdultoMayor(cedula, nombre);
                break;
        }

        if (p != null) {
            pasajeroDao.guardar(p);
            System.out.println("Pasajero registrado correctamente");
        } else {
            System.out.println("Tipo invalido");
        }
    }

    public void registrarConductor(Scanner sc) {

        System.out.print("Cedula: ");
        String cedula = sc.next();

        System.out.print("Nombre: ");
        String nombre = sc.next();

        System.out.print("Licencia: ");
        String licencia = sc.next();

        System.out.print("Categoria: ");
        String categoria = sc.next();

        Conductor c = new Conductor(cedula, nombre, licencia, categoria);

        conductorDao.guardar(c);

        System.out.println("Conductor registrado correctamente");
    }
}