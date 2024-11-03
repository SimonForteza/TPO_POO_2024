package org.example;

import org.example.model.Sistema;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.crearPartido("river", "boca", 10000, "2024/11/02");
        sistema.crearSocio(46203884, "Simon", "forteza");
        sistema.sacarEntrada(46203884, "2024/11/2", "belgrano", "alta");
        sistema.sacarEntrada(46203884, "2024/11/2", "belgrano", "media", 2);
    }
}
