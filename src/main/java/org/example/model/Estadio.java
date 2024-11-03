package org.example.model;

import java.util.*;

public class Estadio {
    List<Sector>sectores;

    public Estadio() {
        sectores = new ArrayList<>();

        sectores.add(new Belgrano("belgrano"));
        sectores.add(new SanMartin("sanmartin"));
        sectores.add(new Sivori("sivori"));
        sectores.add(new Centenario("centenario"));
    }

    public void reservarSector(String nombreSector, String altura, int numeroAsiento) {
        Sector sector = encontrarSector(nombreSector);
        if (!Objects.isNull(sector)) {
            sector.reservarAltura(altura, numeroAsiento);
        } else {
            System.out.println("El nombre del sector no se encuentra");
        }
    }

    public void reservarSector(String nombreSector, String altura) {
        Sector sector = encontrarSector(nombreSector);
        if (!Objects.isNull(sector)) {
            sector.reservarAltura(altura);
        } else {
            System.out.println("El nombre del sector no se encuentra");
        }
    }

    public void liberarSector(String nombreSector, String altura, int numeroAsiento) {
        Sector sector = encontrarSector(nombreSector);
        if (!Objects.isNull(sector)) {
            sector.liberarAltura(altura, numeroAsiento);
        } else {
            System.out.println("El nombre del sector no se encuentra");
        }
    }

    public void liberarSector(String nombreSector, String altura) {
        Sector sector = encontrarSector(nombreSector);
        if (!Objects.isNull(sector)) {
            sector.liberarAltura(altura);
        } else {
            System.out.println("El nombre del sector no se encuentra");
        }
    }

    private Sector encontrarSector(String nombreSector) {
        for (Sector sector : sectores) {
            if (nombreSector.equals(sector.getNombreSector())) {
                return sector;
            }
        }
        return null;
    }

}
