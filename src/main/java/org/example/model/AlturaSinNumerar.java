package org.example.model;

public class AlturaSinNumerar extends Altura{
    public AlturaSinNumerar(int capacidad) {
        super(capacidad);
    }

    @Override
    public boolean reservarLugares(int numeroAsiento) {
        if (capacidad > 0) {
            capacidad--;
            return true;
        }
        return false;
    }
}
