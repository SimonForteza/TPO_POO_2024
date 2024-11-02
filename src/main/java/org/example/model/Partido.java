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

    public void agregarEntrada(Entrada entrada) {
        entradas.add(entrada);
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
}
