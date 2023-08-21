package ejercicio1;

import ejercicio1.entidades.Libro;
import ejercicio1.servicios.LibroService;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LibroService libroService = new LibroService();

        Libro libro1 = libroService.crearLibro(scanner);

        libroService.mostrarLibro(libro1);
    }
}
