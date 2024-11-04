package org.example;


import org.example.model.Sistema;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el equipo Local del partido");
        String equipoLocal = sc.next();

        System.out.println("Ingrese el equipo Visitante del partido");
        String equipoVisitante = sc.next();

        System.out.println("Ingrese el precioBase");
        int precioBase = sc.nextInt();

        System.out.println("ingrese la fecha partido (año/mes/dia)");
        String fecha = sc.next();


        Sistema sistema = new Sistema();
        sistema.crearPartido(equipoLocal, equipoVisitante, precioBase, fecha);
        sistema.listarPartidos();
        sistema.crearSocio(46203884, "Simon", "forteza");

        sistema.sacarEntrada(46203884, fecha, "belgrano", "alta");

        sistema.sacarEntrada(46203884, fecha, "belgrano", "media", 2);

        sistema.listarEntradasSocio(46203884);

        sistema.cancelarEntrada(46203884, fecha, "belgrano", "media", 2, 2);

        System.out.println("DESPUES DE ELIMINAR LA ENTRADA");
        sistema.listarEntradasSocio(46203884);
    }
}