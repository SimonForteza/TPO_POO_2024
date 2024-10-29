package org.example.model;

import java.util.Date;

public class AlturaNoNumerada extends Altura{

    public AlturaNoNumerada(String nombreAltura, int capacidad) {
        super(nombreAltura,capacidad,false);
    }

    @Override
    public void crearEntrada() {
        for (int i = 0; i <= capacidad; i++) {
            entradas.add(new Entrada(null, nombreAltura, null, new Date()));
        }
    }
}
