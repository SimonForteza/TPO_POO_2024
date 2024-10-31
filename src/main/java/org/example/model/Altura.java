package org.example.model;

public abstract class Altura {
    protected int capacidad;

    public Altura(int capacidad) {
        this.capacidad = capacidad;
    }

    public abstract boolean reservarLugares(int numeroAsiento);
}
