package model;

/**
 *
 * @author ronal
 */
public class Ruta {

    private String ciudadOrigen;
    private String ciudadDestino;
    private double distanciaKm;
    private int tiempoMinutos;
    private String codigoRuta;
         
    public Ruta(String r1, String valledupar, String bogotá, int i, int i0) {
        this.codigoRuta = codigoRuta;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.distanciaKm = distanciaKm;
        this.tiempoMinutos = tiempoMinutos;
    }

    public String getCodigoRuta() {
        String codigoRuta = null;
        return codigoRuta;
    }

    public void setCodigoRuta(String codigoRuta) {
    }

    public String getCiudadOrigen() {
        String CiudadOrigen = null;
        return CiudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        String CiudadDestino = null;
        return CiudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getDistanciaKm() {
        double DistanciaKm = 0;
        return DistanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public int getTiempoMinutos() {
        int TiempoMinutos = 0;
        return TiempoMinutos;
    }

    public void setTiempoMinutos(int tiempoMinutos) {
        this.tiempoMinutos = tiempoMinutos;
    }

    @Override
    public String toString() {
        return ciudadOrigen + " -> " + ciudadDestino
                + " (" + distanciaKm + " km, " + tiempoMinutos + " min)";
    }
}
