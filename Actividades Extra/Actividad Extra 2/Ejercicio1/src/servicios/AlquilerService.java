package servicios;


import entidades.Alquiler;
import entidades.Pelicula;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AlquilerService {

    private Alquiler[] listaAlquileres = new Alquiler[1];
    private Pelicula[] peliculasAlquiladas = new Pelicula[1];

    public Alquiler[] crearAlquiler(Scanner leer, Pelicula[] catalogoPeliculas) throws ParseException {

        if (listaAlquileres[0] == null) {
            listaAlquileres[0] = ingresarAlquiler(leer, catalogoPeliculas);
        } else {
            Alquiler[] alquileresActualizado = new Alquiler[listaAlquileres.length + 1];

            for (int i = 0; i < listaAlquileres.length; i++) {
                alquileresActualizado[i] = listaAlquileres[i];
            }

            alquileresActualizado[alquileresActualizado.length - 1] = ingresarAlquiler(leer, catalogoPeliculas);

            listaAlquileres = alquileresActualizado.clone();
        }

        return listaAlquileres;

        /*Alquiler[] alquileresActualizado = new Alquiler[listaAlquileres.length + 1];

        listaAlquileres[listaAlquileres.length - 1] = ingresarAlquiler(leer, catalogoPeliculas);

        for (int i = 0; i < listaAlquileres.length; i++) {
            alquileresActualizado[i] = listaAlquileres[i];
        }

        listaAlquileres = alquileresActualizado.clone();

        return listaAlquileres;*/
    }

    public Alquiler ingresarAlquiler(Scanner leer, Pelicula[] pelis) throws ParseException {

        int opc;
        System.out.println("\nPelículas disponibles: ");
        do {
            for (int i = 0; i < pelis.length; i++) {
                if (pelis[i] != null) {
                    System.out.println((i + 1) + " - " + pelis[i].getTitulo());
                }
            }
            System.out.print("Indique la película que desea alquilar:");
            opc = leer.nextInt();
        } while (opc < 0 || opc > pelis.length);

        Pelicula peliculaAlquilada = pelis[opc - 1];

        pelis[opc - 1] = null;

        leer.nextLine();
        System.out.println("\nIngrese información del alquiler.");
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Ingrese la fecha de inicio del alquiler (dd/mm/aaaa): ");
        String fechaI = leer.next();
        System.out.print("Ingrese la fecha de finalización del alquiler (dd/mm/aaaa): ");
        String fechaF = leer.next();
        Date fechaInicio = formato.parse(fechaI);
        Date fechaFin = formato.parse(fechaF);
        System.out.print("Ingrese el valor diario del alquiler:");
        int precio = leer.nextInt();

        return new Alquiler(peliculaAlquilada, fechaInicio, fechaFin, precio);
    }


    public void calcularTotalServicio() {

        double totalAlquileres = 0;

        for (int i = 0; i < listaAlquileres.length; i++) {

            double fechaFin = listaAlquileres[i].getFechaFin().getTime();
            double fechaInicio = listaAlquileres[i].getFechaInicio().getTime();
            double precio = listaAlquileres[i].getPrecio();

            double diasAlquilados = (fechaFin - fechaInicio) / (1000*60*60*24);

            if (diasAlquilados <= 3) {
                totalAlquileres += precio;
            } else {
                totalAlquileres += ((0.1*(diasAlquilados - 3) + 1)*precio);
            }
        }

        System.out.println("\nEl total del servicio de alquileres es de: $" + totalAlquileres);
    }

    public void buscarPorFecha(Scanner leer) throws ParseException {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Ingrese la fecha de los alquileres de deseas buscar (dd/mm/aaaa): ");
        double fechaBusqueda = formato.parse(leer.nextLine()).getTime();

        if (alquilerFecha(fechaBusqueda)) {

            for (int i = 0; i < listaAlquileres.length; i++) {

                double fechaFin = listaAlquileres[i].getFechaFin().getTime();
                double fechaInicio = listaAlquileres[i].getFechaInicio().getTime();

                if (fechaInicio <= fechaBusqueda && fechaBusqueda <= fechaFin) {
                    System.out.println("\nInformación del alquiler " + (i + 1) + ":");
                    System.out.println(listaAlquileres[i].toString());
                }
            }
        }
    }

    public boolean alquilerFecha(double fechaBusqueda) {

        for (int i = 0; i < listaAlquileres.length; i++) {

            double fechaFin = listaAlquileres[i].getFechaFin().getTime();
            double fechaInicio = listaAlquileres[i].getFechaInicio().getTime();

            if (fechaInicio <= fechaBusqueda && fechaBusqueda <= fechaFin) {
                System.out.println("\nExiste un alquiler en esa fecha.");
                return true;
            }
        }

        System.out.println("\nNo hay ningún alquiler en esa fecha.");
        return false;
    }

    public void mostrarAlquileres() {

        System.out.println("\nLista de Alquileres.");
        for (int i = 0; i < listaAlquileres.length; i++) {
            System.out.println("\nInformación del alquiler " + (i + 1) + ":");
            System.out.println(listaAlquileres[i].toString());
        }

        calcularTotalServicio();
    }

}
