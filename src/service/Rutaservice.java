/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import dao.RutaDAO;
import model.Ruta;

public class RutaService {

    private RutaDAO rutaDAO;

    public RutaService(RutaDAO rutaDAO) {
        this.rutaDAO = rutaDAO;
    }

    public void registrarRuta(Ruta ruta) {
        rutaDAO.guardarRuta(ruta);
    }
}
