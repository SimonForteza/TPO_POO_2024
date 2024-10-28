package org.example.model;

public class Asiento {
    private int numeroAsiento;
    private boolean ocupado;

    public Asiento(int numeroAsiento, boolean ocupado) {
        this.numeroAsiento = numeroAsiento;
        this.ocupado = ocupado;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "numeroAsiento=" + numeroAsiento +
                ", ocupado=" + ocupado +
                '}';
    }
}
