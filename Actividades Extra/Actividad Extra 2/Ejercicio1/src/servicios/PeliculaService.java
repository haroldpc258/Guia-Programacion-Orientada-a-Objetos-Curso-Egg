package servicios;

import entidades.Pelicula;

import java.util.Scanner;

public class PeliculaService {

    private Pelicula[] catalogo = new Pelicula[1];

    public  Pelicula[] cargarPelicula(Scanner leer) {

        if (catalogo[0] == null) {
            catalogo[0] = crearPelicula(leer);
        } else {

            Pelicula[] catalogoActualizado = new Pelicula[catalogo.length + 1];

            for (int i = 0; i < catalogo.length; i++) {
                catalogoActualizado[i] = catalogo[i];
            }

            catalogoActualizado[catalogoActualizado.length-1] = crearPelicula(leer);

            catalogo = catalogoActualizado.clone();
        }

        return catalogo;
    }

    public Pelicula crearPelicula(Scanner leer){

        System.out.println("\nIngresando una nueva película... ");

        System.out.print("Título: ");
        String titulo = leer.nextLine();

        System.out.print("Género: ");
        String genero = leer.nextLine();

        System.out.print("Año: ");
        int anio = leer.nextInt();

        System.out.print("Duración (en minutos): ");
        int duracion = leer.nextInt();

        return new Pelicula(titulo, genero, anio, duracion);
    }

    public boolean buscarPorGenero(Scanner leer) {

        System.out.print("\nIndique el género para comprobar disponibilidad: ");
        String genero = leer.nextLine();

        for (int i = 0; i< catalogo.length; i++) {
            if (catalogo[i] != null) {
                if (catalogo[i].getGenero().equalsIgnoreCase(genero)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean buscarPorTitulo(Scanner leer){

        System.out.print("\nIndique el título para comprobar disponibilidad: ");
        String titulo = leer.nextLine();

        for (int i = 0; i< catalogo.length; i++) {
            if (catalogo[i] != null) {
                if (catalogo[i].getTitulo().equalsIgnoreCase(titulo) || catalogo[i].getTitulo().contains(titulo)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void mostrarPeliculas(){

        for (int i = 0; i < catalogo.length; i++){

            if (catalogo[i] != null) {

                System.out.println("\nPelícula " + (i+1) + " :");
                System.out.println(catalogo[i].toString());
            }
        }
    }
}
