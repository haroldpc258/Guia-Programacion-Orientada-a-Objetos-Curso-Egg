package ejercicio6.servicios;

import ejercicio6.entidades.Ahorcado;

import java.util.Scanner;

public class AhorcadoService {

    Scanner scanner = new Scanner(System.in);
    String[] mostrarPalabra;

    public Ahorcado crearJuego() {

        System.out.println("\nBienvenido!");
        System.out.print("Ingrese la palabra a jugar: ");
        String palabra = scanner.nextLine();

        System.out.print("Indique la cantidad de jugadas máxima: ");
        int intentos = scanner.nextInt();

        String[] vectorPalabra = new String[palabra.length()];
        mostrarPalabra = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {

            vectorPalabra[i] = palabra.substring(i, i+1);
            mostrarPalabra[i] = "_";
        }

        return new Ahorcado(vectorPalabra, 0, intentos);
    }

    public void longitud(Ahorcado ahorcado) {
        System.out.println("La palabra que debes encontrar tiene " + ahorcado.getPalabraBuscando().length + " letras!");
    }

    public boolean buscar(Ahorcado ahorcado, String letra) {

        String[] palabra = ahorcado.getPalabraBuscando();

        for (int i = 0; i < palabra.length; i++) {

            if (palabra[i].equalsIgnoreCase(letra)) {
                System.out.println("\nLa letra sí está en la Palabra!!!");
                return true;
            }
        }

        System.out.println("\nNo está la letra :c");
        return false;
    }

    public boolean encontradas(Ahorcado ahorcado, String letra) {

        String[] palabra = ahorcado.getPalabraBuscando();
        boolean encontre = false;
        for (int i = 0; i < palabra.length; i++) {

            if (palabra[i].equalsIgnoreCase(letra) && !palabra[i].equals(mostrarPalabra[i])) {
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
                mostrarPalabra[i] = letra;
                encontre = true;
            } else if (palabra[i].equalsIgnoreCase(letra)) {
                System.out.println("Pero ya habías buscado esta letra antes, lo siento, un intento menos :c");
                break;
            }
        }

        System.out.println("\nHasta el momento has encontrado: " + ahorcado.getLetrasEncontradas() + " letras.");
        System.out.println("Te faltan " + (palabra.length - ahorcado.getLetrasEncontradas()) + " letras.");
        return encontre;
    }

    public void intentos(Ahorcado ahorcado) {
        System.out.println("\nTe quedan: " + ahorcado.getNumeroIntentos() + " intentos.");
    }

    public void mostrarTexto() {

        System.out.println();
        for (int i = 0; i < mostrarPalabra.length; i++) {

            System.out.print(mostrarPalabra[i]);
        }
        System.out.println();
    }
    public void juego() {

        Ahorcado ahorcado = crearJuego();
        longitud(ahorcado);
        scanner.nextLine();


        while (ahorcado.getNumeroIntentos() > 0 && ahorcado.getLetrasEncontradas() < ahorcado.getPalabraBuscando().length) {

            System.out.print("\nDime qué letra deseas intentar buscar: ");
            String letra = scanner.nextLine();

            buscar(ahorcado,letra);
            boolean encontre = encontradas(ahorcado, letra);

            mostrarTexto();

            if (!encontre) {
                ahorcado.setNumeroIntentos(ahorcado.getNumeroIntentos() - 1);
            }

            intentos(ahorcado);

            System.out.println("\n---------------------------------------------");
        }

        if (ahorcado.getNumeroIntentos() == 0) {
            System.out.println("\nLo siento, se acabaron los intentos :c");
        } else {
            System.out.print("\nFelicitaciones!!! Descubriste la palabra ");
        }
    }
}
