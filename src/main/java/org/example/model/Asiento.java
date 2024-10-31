package org.example.model;

public class Asiento {
    private int numeroAsiento;
    private boolean ocupado;

    public Asiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
        ocupado = false;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void ocupar() {
        this.ocupado = true;
    }
}
