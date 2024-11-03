package org.example.model;

public abstract class Altura {
    protected int capacidad;
    private int precio;

    public Altura(int capacidad, int precio) {
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public abstract boolean reservarLugares(Integer numeroAsiento);
    public abstract boolean liberarLugares(Integer numeroAsiento);

    public int getPrecio() {
        return precio;
    }
}
