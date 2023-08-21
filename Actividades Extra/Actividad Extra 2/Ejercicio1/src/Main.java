import entidades.Alquiler;
import entidades.Pelicula;
import servicios.AlquilerService;
import servicios.PeliculaService;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        PeliculaService peliculaService = new PeliculaService();
        AlquilerService alquilerService = new AlquilerService();

        Pelicula[] catalogoPeliculas = new Pelicula[0];
        Alquiler[] listaAlquileres = new Alquiler[0];

        int opcion;
        do {
            System.out.println("\nMENÚ.");
            System.out.println("1. Cargar una película");
            System.out.println("2. Mostrar lista de películas disponibles");
            System.out.println("3. Crear un alquiler");
            System.out.println("4. Mostrar lista de alquileres");
            System.out.println("5. Buscar película por título");
            System.out.println("6. Buscar película por género");
            System.out.println("7. Buscar alquileres por fecha");
            System.out.println("8. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine();
                    catalogoPeliculas = peliculaService.cargarPelicula(scanner);
                    break;
                case 2:
                    if (catalogoPeliculas.length > 0) {
                        peliculaService.mostrarPeliculas();
                        break;
                    }
                case 3:
                    if (catalogoPeliculas.length > 0) {
                        listaAlquileres = alquilerService.crearAlquiler(scanner, catalogoPeliculas);
                        break;
                    }
                case 4:
                    if (listaAlquileres.length > 0) {
                        alquilerService.mostrarAlquileres();
                        break;
                    }
                case 5:
                    if (catalogoPeliculas.length > 0) {
                        scanner.nextLine();
                        if (peliculaService.buscarPorTitulo(scanner)) {
                            System.out.println("La película se encuentra disponible.");
                        } else {
                            System.out.println("La película no se encuentra disponible");
                        }
                        break;
                    }
                case 6:
                    if (catalogoPeliculas.length > 0) {
                        scanner.nextLine();
                        if (peliculaService.buscarPorGenero(scanner)) {
                            System.out.println("Hay disponibilidad de películas de este género.");
                        } else {
                            System.out.println("No hay películas de este género disponibles en este momento.");
                        }
                        break;
                    }
                case 7:
                    if (listaAlquileres.length > 0) {
                        scanner.nextLine();
                        alquilerService.buscarPorFecha(scanner);
                        break;
                    }
                    break;
                case 8:
                    System.out.println("\nHasta pronto...");
                    break;
                default:
                    System.out.println("\nLa opción seleccionada no es válida. Inténtelo nuevamente...");
            }
        } while (opcion != 8);
    }
}