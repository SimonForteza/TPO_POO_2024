package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AlturaNumerada extends Altura{
    private List<Asiento> asientos;

    public AlturaNumerada(int capacidad, int precio) {
        super(capacidad, precio);
        asientos = new ArrayList<>();

        for (int i = 0; i < capacidad; i++) {
            asientos.add(new Asiento(i));
        }
    }

    @Override
    public boolean reservarLugares(Integer numeroAsiento) {
        if (!Objects.isNull(numeroAsiento)) {
            for (Asiento asiento : asientos) {
                if (asiento.getNumeroAsiento() == numeroAsiento) {
                    asiento.ocupar();
                    return true;
                }
            }
        }
        return false;
    }
}
