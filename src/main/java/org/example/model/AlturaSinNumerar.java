package org.example.model;

public class AlturaSinNumerar extends Altura{

    private int lugaresUsados;
    public AlturaSinNumerar(int capacidad, int precio) {
        super(capacidad, precio);
        lugaresUsados = 0;
    }

    @Override
    public boolean reservarLugares(Integer numeroAsiento) {
        if (capacidad > 0) {
            capacidad--;
            lugaresUsados++;
            return true;
        }
        return false;
    }

    @Override
    public boolean liberarLugares(Integer numeroAsiento) {
        if (lugaresUsados > 0) {
            capacidad++;
            return true;
        }
        return false;
    }
}
