package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Sector {
    private String nombreSector;
    private int capacidad;
    private int precio;
    List<Asiento> asientos;

    public Sector(String nombreSector, int capacidad) {
        this.nombreSector = nombreSector;
        this.capacidad = capacidad;
        this.asientos = new ArrayList<>();

        for (int i = 1; i < capacidad; i++) {
            asientos.add(new Asiento(i, false));
        }
    }

    public void agregarAsiento(int numeroAsiento) {
        for (Asiento asiento: asientos) {
            if (numeroAsiento == asiento.getNumeroAsiento() && verficarDisponibilidad(numeroAsiento)) {
                asiento.setOcupado(true);
                return;
            }
        }
        System.out.println("El número de asiento no esta disponible");

    }


    public boolean verficarDisponibilidad(int numeroAsiento) {
        for (Asiento asiento: asientos) {
            if (numeroAsiento == asiento.getNumeroAsiento() && !asiento.isOcupado()) {
                return true;
            }
        }
        return false;
    }


    public String getNombreSector() {
        return nombreSector;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    @Override
    public String toString() {
        return "Sector{" +
                "nombreSector='" + nombreSector + '\'' +
                ", capacidad=" + capacidad +
                ", precio=" + precio +
                ", asientos=" + asientos.toString() +
                '}';
    }
}
