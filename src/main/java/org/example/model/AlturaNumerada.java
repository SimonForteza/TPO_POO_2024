package org.example.model;

import java.util.Date;

public class AlturaNumerada extends Altura{

    public AlturaNumerada(String nombreAltura, int capacidad) {
        super(nombreAltura, capacidad, true);
    }

    @Override
    public void crearEntrada() {
        for (int i = 0; i <= capacidad; i++) {
            entradas.add(new Entrada(null, nombreAltura, i, new Date()));
        }
    }
}
