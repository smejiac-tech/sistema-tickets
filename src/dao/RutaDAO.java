
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Ruta;

/**
 *
 * @author ronal
 */
public class RutaDAO {

    private final List<Ruta> rutas = new ArrayList<>();

    public void guardarRuta(Ruta ruta) {
        rutas.add(ruta);
    }

    public List<Ruta> listarRutas() {
        return rutas;
    }
}
