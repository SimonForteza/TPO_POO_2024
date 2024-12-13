package org.example.model;

import java.util.Date;

public class Entrada {
    private static int contador = 0;
    private int id;
    private Socio socio;
    private Partido partido;
    private String sector;
    private String altura;
    private Integer numeroAsiento;
    private double precio;
    private Date fecha;
    private EstadoEntrada estado;

    public Entrada(Socio socio, Partido partido, String sector, String altura, Integer numeroAsiento) {
        this.id = ++contador;
        this.socio = socio;
        this.partido = partido;
        this.sector = sector;
        this.altura = altura;
        this.numeroAsiento = numeroAsiento;
        this.precio = calcularPrecio();
        this.fecha = new Date();
        this.estado = EstadoEntrada.ACTIVA;

        crearEntrada();
    }

    public Entrada(Socio socio, Partido partido, String sector, String altura) {
        this.id = ++contador;
        this.socio = socio;
        this.partido = partido;
        this.sector = sector;
        this.altura = altura;
        this.precio = calcularPrecio();
        this.fecha = new Date();
        this.estado = EstadoEntrada.ACTIVA;

        crearEntrada();
    }

    private void crearEntrada() {
        partido.agregarEntrada(this);
    }

    public void cancelarEntrada(int id) {
        partido.cancelarEntrada(id);
    }

    public double calcularPrecio() {
        double resultado = partido.getPrecioBase() + partido.calcularPrecio(sector, altura);
        return resultado;
    }

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "id=" + id +
                ", partido=" + partido.getFecha() +
                ", sector='" + sector + '\'' +
                ", altura='" + altura + '\'' +
                ", numeroAsiento=" + numeroAsiento +
                ", precio=" + precio +
                ", fecha=" + fecha +
                ", estado=" + estado +
                '}';
    }
}
