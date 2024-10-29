package org.example.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Altura {
    protected String nombreAltura;
    protected boolean esNumerada;

    protected int capacidad;
    protected List<Entrada> entradas;

    public Altura(String nombreAltura, int capacidad, boolean esNumerada) {
        this.nombreAltura = nombreAltura;
        this.capacidad = capacidad;
        this.esNumerada = esNumerada;
        this.entradas = new ArrayList<>();
    }

    public abstract void crearEntrada();

    public String getNombreAltura() {
        return nombreAltura;
    }

    public boolean isEsNumerada() {
        return esNumerada;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }
}
