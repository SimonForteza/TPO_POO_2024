package org.example.model;

import java.util.Date;
import java.util.List;

public class Partido {

    private Estadio estadio;
    private String equipoLocal;
    private String equipoVisitante;
    private Date fecha;
    private double precioBase;
    List<Entrada> entradas;

    public Partido() {

    }

    public double getPrecioBase() {
        return precioBase;
    }




}
