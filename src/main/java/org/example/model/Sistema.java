package org.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

public class Sistema {

    //private ListaNegra listaNegra;
    List<Partido> partidos;
    List<Socio> socios;

    public Sistema() {
        this.partidos = new ArrayList<>();
        this.socios = new ArrayList<>();
    }

    public void crearPartido(String equipoLocal, String equipoVisitante, int precioBase, String fechaPartido){
        Date fecha = convertirADate(fechaPartido);
        Partido nuevoPartido = new Partido(equipoLocal, equipoVisitante, precioBase, fecha);
        partidos.add(nuevoPartido);
    }

    public void crearSocio(int dni, String nombre, String apellido) {
        Socio nuevoSocio = new Socio(dni, nombre, apellido);
        socios.add(nuevoSocio);
    }

    public void sacarEntrada(int dni, String fechaPartido, String nombreSector, String altura, int numeroAsiento) {
        Socio socioEncontrado = null;
        Partido partidoEncontrado = null;

        // Buscar socio por DNI
        for (Socio socio : socios) {
            if (socio.getDni() == dni) {
                socioEncontrado = socio;
                break;
            }
        }

        // Convertir la fecha de cadena a Date y buscar el partido correspondiente
        Date fechaBuscada = convertirADate(fechaPartido);
        for (Partido partido : partidos) {
            if (esMismaFecha(partido.getFecha(), fechaBuscada)) {
                partidoEncontrado = partido;
                break;
            }
        }

        // Verificar si se encontró el socio y el partido en la fecha indicada
        if (socioEncontrado != null && partidoEncontrado != null) {
            // Intentar sacar la entrada para el socio
            socioEncontrado.sacarEntrada(partidoEncontrado, nombreSector, altura, numeroAsiento);
        } else {
            System.out.println("No se pudo completar la reserva. Verifique el DNI o la fecha del partido.");
        }
    }

    // Método auxiliar para comparar solo la parte de fecha (ignora la hora)
    private boolean esMismaFecha(Date fecha1, Date fecha2) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(fecha1);
        cal2.setTime(fecha2);
        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) &&
                cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);
    }
    private Date convertirADate(String fechaStr) {
        // Dividir la cadena en año, mes y día
        String[] partes = fechaStr.split("/");
        int anio = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int dia = Integer.parseInt(partes[2]);

        // Usar Calendar para convertir a Date
        Calendar calendario = Calendar.getInstance();
        calendario.set(anio, mes - 1, dia); // mes - 1 porque Calendar empieza los meses en 0
        return calendario.getTime();
    }


}
