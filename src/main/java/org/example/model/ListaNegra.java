package org.example.model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
public class ListaNegra {


    private Set<String> listaNegra;

    public ListaNegra(String rutaArchivo) {
        listaNegra = new HashSet<>();
        cargarListaNegra(rutaArchivo);
    }

    private void cargarListaNegra(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                listaNegra.add(linea.trim());
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de lista negra: " + e.getMessage());
        }
    }

    public boolean esSocioValido(int dni) {
        return !listaNegra.contains(String.valueOf(dni));
    }
}

