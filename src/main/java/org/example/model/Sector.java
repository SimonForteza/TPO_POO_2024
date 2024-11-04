package org.example.model;


import java.util.Map;

public abstract class Sector {
    protected String nombreSector;
    protected Altura alta;
    protected Altura media;
    protected Altura baja;

    public Sector(String nombreSector) {
        this.nombreSector = nombreSector;
    }

    public String getNombreSector() {
        return nombreSector;
    }

    public void reservarAltura(String nombreAltura, int numeroAsiento) {
        Altura altura = getAltura(nombreAltura);
        altura.reservarLugares(numeroAsiento);
    }

    public void reservarAltura(String nombreAltura) {
        Altura altura = getAltura(nombreAltura);
        altura.reservarLugares(null);
    }

    public void liberarAltura(String nombreAltura, int numeroAsiento) {
        Altura altura = getAltura(nombreAltura);
        altura.liberarLugares(numeroAsiento);
    }

    public void liberarAltura(String nombreAltura) {
        Altura altura = getAltura(nombreAltura);
        altura.liberarLugares(null);
    }

    public double obtenerPrecio(String nombreAltura) {
        Altura altura = getAltura(nombreAltura);
        return altura.getPrecio();
    }

    private Altura getAltura(String nombreAltura) {
        Map<String, Altura> alturas = Map.of(
                "alta", alta,
                "media", media,
                "baja", baja
        );

        return alturas.get(nombreAltura.toLowerCase());
    }

    public Altura getAlta() {
        return alta;
    }

    public Altura getMedia() {
        return media;
    }

    public Altura getBaja() {
        return baja;
    }
}
