package org.example.model;

import java.util.ArrayList;
import java.util.Date;
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

    public void sacarEntrada(Sector sector, int numeroAsiento) {
        if (sector.verficarDisponibilidad(numeroAsiento)) {
            Entrada entrada = new Entrada(sector);
            sector.agregarAsiento(numeroAsiento);
            entradasSacadas.add(entrada);
        }
    }



    public void getEntradas(){
        for(Entrada entrada : entradasSacadas){
            System.out.println(entrada.toString());
        }
    }

}
