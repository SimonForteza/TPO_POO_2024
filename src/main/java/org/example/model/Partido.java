package org.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private double precioBase;
    private Estadio estadio;
    private Date fecha;
    List<Entrada> entradas;

    public Partido(String equipoLocal, String equipoVisitante, double precioBase, Date fecha) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.precioBase = precioBase;
        estadio = new Estadio();
        this.fecha = fecha;
        entradas = new ArrayList<>();
    }

    public void reservarEstadio(String nombreSector, String altura, int numeroAsiento) {
        estadio.reservarSector(nombreSector, altura, numeroAsiento);
    }

    public void reservarEstadio(String nombreSector, String altura) {
        estadio.reservarSector(nombreSector, altura);
    }

    public void liberarEstadio(String nombreSector, String altura, int numeroAsiento) {
        estadio.liberarSector(nombreSector, altura, numeroAsiento);
    }

    public void liberarEstadio(String nombreSector, String altura) {
        estadio.liberarSector(nombreSector, altura);
    }


    public void agregarEntrada(Entrada entrada) {
        entradas.add(entrada);
    }

    public void cancelarEntrada(int idEntrada) {
        entradas.removeIf(entrada -> entrada.getId() == idEntrada);
    }

    public double calcularPrecio(String nombreSector, String nombreAltura) {
        return estadio.calcularPrecio(nombreSector, nombreAltura);
    }


    public String getEquipoLocal() {
        return equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "equipoLocal='" + equipoLocal + '\'' +
                ", equipoVisitante='" + equipoVisitante + '\'' +
                ", precioBase=" + precioBase +
                ", estadio=" + estadio.getNombreEstadio() +
                ", fecha=" + fecha +
                '}';
    }
}
