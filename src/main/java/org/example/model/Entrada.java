package org.example.model;

import java.util.Date;

public class Entrada {
    private static int contador = 0;
    private int id;
    private Integer numeroAsiento;
    private String sector;
    private String altura;
    private boolean ocupada;
    private Socio socio; // Socio propietario de la entrada
    private Date fecha;

    public Entrada(String sector, String altura, Integer numeroAsiento, Date fecha) {
        this.id = ++contador;
        this.numeroAsiento = numeroAsiento;
        this.sector = sector;
        this.altura = altura;
        this.ocupada = false;
        this.fecha = new Date();
    }

}
