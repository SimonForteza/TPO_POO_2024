package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Socio {
    private int numeroSocio;
    private String nombre;
    private String apellido;
    private String email;
    private int telefono;
    private boolean cuotaPaga;
    private List<Entrada> entradasSacadas;

    public Socio(int numeroSocio, String nombre, String apellido, String email, int telefono, boolean cuotaPaga) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.cuotaPaga = cuotaPaga;
        this.entradasSacadas = new ArrayList<>();
    }
}
