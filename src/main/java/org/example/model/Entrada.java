package org.example.model;

import java.util.Date;

public class Entrada {
    private int id;
    private Socio socio;
    private Asiento asiento;
    private double precio;
    private Date fecha;

    public Entrada(int id, Socio socio, Asiento asiento, double precio, Date fecha) {
        this.id = id;
        this.socio = socio;
        this.asiento = asiento;
        this.precio = precio;
        this.fecha = fecha;
    }
}
