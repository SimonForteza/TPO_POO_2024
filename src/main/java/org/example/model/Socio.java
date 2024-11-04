package org.example.model;

import javax.xml.xpath.XPathEvaluationResult;
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
            partido.reservarEstadio(nombreSector, altura, numeroAsiento);

            Entrada entrada = new Entrada(this, partido, nombreSector, altura, numeroAsiento);
            entradasSacadas.add(entrada);
            return;
        }
        System.out.println("La cuota no está al dia");
    }

    public void sacarEntrada(Partido partido, String nombreSector, String altura){
        if (cuotaPaga) {
            partido.reservarEstadio(nombreSector, altura);

            Entrada entrada = new Entrada(this, partido, nombreSector, altura);
            entradasSacadas.add(entrada);
            return;
        }
        System.out.println("La cuota no está al dia");
    }

    public void cancelarEntrada(Partido partido, String nombreSector, String altura, Integer numeroAsiento, int idEntrada) {
        partido.liberarEstadio(nombreSector, altura, numeroAsiento);

        for (Entrada entrada: entradasSacadas) {
            if (entrada.getId() == idEntrada) {
                entrada.cancelarEntrada(idEntrada);
                entradasSacadas.remove(entrada);
                break;
            }
        }
    }

    public void cancelarEntrada(Partido partido, String nombreSector, String altura, int idEntrada) {
        partido.liberarEstadio(nombreSector, altura);

        for (Entrada entrada: entradasSacadas) {
            if (entrada.getId() == idEntrada) {
                entrada.cancelarEntrada(idEntrada);
                entradasSacadas.remove(entrada);
                break;
            }
        }
    }

    public void listarEntradas() {
        for (Entrada entrada: entradasSacadas) {
            System.out.println(entrada.toString());
        }
    }


    public int getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "numeroSocio=" + numeroSocio +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cuotaPaga=" + cuotaPaga +
                '}';
    }
}
