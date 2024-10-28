package org.example.model;

import java.util.Date;

public class Entrada {
    private static int contador = 0;
    private int id;
    private Sector sector;
    private Date fecha;

    public Entrada(Sector sector) {
        this.sector = sector;
        this.fecha = new Date();
        this.id = ++contador;

    }

    @Override
    public String toString() {
        return "Entrada{" +
                "id=" + id +
                ", sector=" + sector +
                ", fecha=" + fecha +
                '}';
    }
}
