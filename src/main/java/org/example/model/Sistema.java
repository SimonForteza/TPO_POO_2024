package org.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;

public class Sistema {

    private ListaNegra listaNegra;
    List<Partido> partidos;
    List<Socio> socios;

    public Sistema() {
        this.partidos = new ArrayList<>();
        this.socios = new ArrayList<>();
        listaNegra = new ListaNegra("C:/Users/forte/Documents/TPO_POO_2024/src/main/resources/listaNegra.txt");
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

    public void sacarEntrada(int dni, String fechaPartido, String nombreSector, String altura, Integer numeroAsiento) {
        if (listaNegra.esSocioValido(dni)) {
            realizarReserva(dni, fechaPartido, nombreSector, altura, numeroAsiento);
            return;
        }
        System.out.println("El socio se encuentra en la lista negra. No puede sacar una entrada");

    }

    public void sacarEntrada(int dni, String fechaPartido, String nombreSector, String altura) {
        if (listaNegra.esSocioValido(dni)) {
            realizarReserva(dni, fechaPartido, nombreSector, altura, null);
            return;
        }
        System.out.println("El socio se encuentra en la lista negra. No puede sacar una entrada");
    }


    public void cancelarEntrada(int dni, String fechaPartido, String nombreSector, String altura, Integer numeroAsiento, int idEntrada) {
        cancelarReserva(dni, fechaPartido, nombreSector, altura, numeroAsiento, idEntrada);
    }

    public void cancelarEntrada(int dni, String fechaPartido, String nombreSector, String altura, int idEntrada) {
        cancelarReserva(dni, fechaPartido, nombreSector, altura, null, idEntrada);
    }

    private void cancelarReserva(int dni, String fechaPartido, String nombreSector, String altura, Integer numeroAsiento, int idEntrada) {
        Socio socioEncontrado = buscarSocioPorDni(dni);
        Partido partidoEncontrado = buscarPartidoPorFecha(fechaPartido);

        if (socioEncontrado != null && partidoEncontrado != null) {
            if (numeroAsiento != null) {
                socioEncontrado.cancelarEntrada(partidoEncontrado, nombreSector, altura, numeroAsiento, idEntrada);
            } else {
                socioEncontrado.cancelarEntrada(partidoEncontrado, nombreSector, altura, idEntrada);
            }
        } else {
            System.out.println("No se pudo completar la reserva. Verifique el DNI o la fecha del partido.");
        }
    }


    public void listarSocios() {
        for (Socio socio: socios) {
            System.out.println(socio.toString());;
        }
    }

    public void listarEntradasSocio(int dni) {
        Socio socioEncontrado = buscarSocioPorDni(dni);
        if (socioEncontrado != null) {
            socioEncontrado.listarEntradas();
        }
    }


    private void realizarReserva(int dni, String fechaPartido, String nombreSector, String altura, Integer numeroAsiento) {
        Socio socioEncontrado = buscarSocioPorDni(dni);
        Partido partidoEncontrado = buscarPartidoPorFecha(fechaPartido);

        if (socioEncontrado != null && partidoEncontrado != null) {
            if (numeroAsiento != null) {
                socioEncontrado.sacarEntrada(partidoEncontrado, nombreSector, altura, numeroAsiento);
            } else {
                socioEncontrado.sacarEntrada(partidoEncontrado, nombreSector, altura);
            }
        } else {
            System.out.println("No se pudo completar la reserva. Verifique el DNI o la fecha del partido.");
        }
    }


    private Socio buscarSocioPorDni(int dni) {
        for (Socio socio : socios) {
            if (socio.getDni() == dni) {
                return socio; // Retorna el socio encontrado
            }
        }
        return null; // Si no se encontró, retorna null
    }

    private Partido buscarPartidoPorFecha(String fechaPartido) {
        Date fechaBuscada = convertirADate(fechaPartido);
        for (Partido partido : partidos) {
            if (esMismaFecha(partido.getFecha(), fechaBuscada)) {
                return partido; // Retorna el partido encontrado
            }
        }
        return null; // Si no se encontró, retorna null
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
