package org.example.model;

import java.util.Date;

public class Entrada {
    private static int contador = 0;
    private int id;
    private Partido partido;
    private String sector;
    private String altura;
    private Integer numeroAsiento;
    private double precio;
    private Date fecha;
    private EstadoEntrada estado;

    public Entrada(Partido partido, String sector, String altura, Integer numeroAsiento) {
        this.id = ++contador;
        this.partido = partido;
        this.sector = sector;
        this.altura = altura;
        this.numeroAsiento = numeroAsiento;
        this.precio = 10000;
        this.fecha = new Date();
        this.fecha = new Date();
        this.estado = EstadoEntrada.ACTIVA;

        crearEntrada();
    }

    private void crearEntrada() {
        partido.reservarEstadio(sector, altura, numeroAsiento);
        partido.agregarEntrada(this);
    }



}
