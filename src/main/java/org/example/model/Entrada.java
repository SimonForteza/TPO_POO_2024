package org.example.model;

import java.util.Date;

public class Entrada {
    private static int contador = 0;
    private int id;
    private Partido partido;
    private Sector sector;
    private Altura altura;
    private Integer numeroAsiento;
    private double precio;
    private Date fecha;
    private EstadoEntrada estado;

    public Entrada(Partido partido, Sector sector, Altura altura, Integer numeroAsiento) {
        this.id = ++contador;
        this.partido = partido;
        this.sector = sector;
        this.altura = altura;
        this.numeroAsiento = numeroAsiento;
        this.precio = calcularPrecio();
        this.fecha = new Date();
        this.fecha = new Date();
        this.estado = EstadoEntrada.ACTIVA;
    }

    private double calcularPrecio() {
        return partido.getPrecioBase() * altura.getPrecio();
    }

    public void cancelar() {

    }

}
