package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class AlturaNumerada extends Altura{
    private List<Asiento> asientos;

    public AlturaNumerada(int capacidad) {
        super(capacidad);
        asientos = new ArrayList<>();

        for (int i = 0; i < capacidad; i++) {
            asientos.add(new Asiento(i));
        }
    }

    @Override
    public boolean reservarLugares(int numeroAsiento) { // podria devolver un boolean
        for (Asiento asiento: asientos) {
            if (asiento.getNumeroAsiento() == numeroAsiento) {
                asiento.ocupar();
                return true;
            }
        }
       return false;
    }
}
