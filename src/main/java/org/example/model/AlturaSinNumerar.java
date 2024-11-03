package org.example.model;

public class AlturaSinNumerar extends Altura{
    public AlturaSinNumerar(int capacidad, int precio) {
        super(capacidad, precio);
    }

    @Override
    public boolean reservarLugares(Integer numeroAsiento) {
        if (capacidad > 0) {
            capacidad--;
            return true;
        }
        return false;
    }
}
