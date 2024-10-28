package org.example;

import org.example.model.Sector;
import org.example.model.Socio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio(121, "simon", "apellido", "aa", 111, true);
        Sector sanMartin = new Sector("San Martin", 5);
        socio1.sacarEntrada(sanMartin,1);
        //socio1.sacarEntrada(sanMartin,2);
        socio1.getEntradas();
    }
}