package org.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Socio {
    private static int socioContador = 0;
    private int numeroSocio;
    private int dni;
    private String nombre;
    private String apellido;
    private boolean cuotaPaga;
    private List<Entrada> entradasSacadas;

    public Socio(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuotaPaga = true;
        numeroSocio = ++socioContador;
        entradasSacadas = new ArrayList<>();
    }

    public void sacarEntrada(Partido partido, String nombreSector, String altura, Integer numeroAsiento){
        if (cuotaPaga) {
            Entrada entrada = new Entrada(this, partido, nombreSector, altura, numeroAsiento);
            entradasSacadas.add(entrada);
            return;
        }
        System.out.println("La cuota no está al dia");
    }

    public int getDni() {
        return dni;
    }
}
