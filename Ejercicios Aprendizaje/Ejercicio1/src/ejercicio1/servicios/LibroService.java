package ejercicio1.servicios;

import ejercicio1.entidades.Libro;

import java.util.Scanner;

public class LibroService {

    public Libro crearLibro(Scanner scanner) {

        System.out.println("Información del libro...");

        System.out.print("Ingrese el ISBN del libro: ");
        String isbn = scanner.nextLine();

        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese el número de páginas del libro: ");
        int numPaginas = scanner.nextInt();

        return new Libro(isbn, titulo, autor, numPaginas);
    }

    public void mostrarLibro(Libro libro) {

        System.out.println("\nEl libro posee la siguiente información:");
        System.out.println(libro);
    }
}