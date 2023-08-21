package ejercicio8.servicios;

import ejercicio8.entidades.Cadena;

import java.util.Scanner;

public class CadenaService {

    Scanner scanner = new Scanner(System.in);

    public Cadena crearCadena() {

        Cadena cadena = new Cadena();

        System.out.print("\nIngrese una cadena. \nEsta puede ser una o varias palabras separadas por un espacio en blanco: ");
        String frase = scanner.nextLine();
        cadena.setFrase(frase);
        cadena.setLongitud(frase.length());

        return cadena;
    }

    public void mostrarVocales(Cadena cadena) {

        int contador = 0;
        String frase = cadena.getFrase().toLowerCase();

        for (int i = 0; i < frase.length(); i++) {

            String vocal = frase.substring(i, i+1);
            if (vocal.equals("a") || vocal.equals("e") ||vocal.equals("i") ||vocal.equals("o") || vocal.equals("u")) {
                contador++;
            }
        }

        System.out.println("Cantidad de vocales en la palabra: " + contador);
    }

    public Cadena invertirFrase(Cadena cadena) {

        String fraseInvertida = "";
        String frase = cadena.getFrase();

        for (int i = frase.length()-1; i >= 0; i--) {
            fraseInvertida = fraseInvertida + frase.substring(i, i+1);
        }

        return cadena;
    }

    public void vecesRepetido(Cadena cadena) {

        int contador = 0;
        String frase = cadena.getFrase().toLowerCase();

        System.out.print("Ingrese la letra que desea buscar: ");
        String letra = scanner.nextLine();

        for (int i = 0; i < frase.length(); i++) {

            String comparar = frase.substring(i, i+1);
            if (comparar.equals(letra)) {
                contador++;
            }
        }

        System.out.println("Veces que se encuentra la letra " + letra + ": " + contador);
    }

    public void compararLongitud(Cadena cadena) {

        String frase = cadena.getFrase();

        System.out.print("Ingrese la frase que desea comparar: ");
        String fraseComparar = scanner.nextLine();

        int relacion = frase.length() - fraseComparar.length();

        if (relacion == 0) {
            System.out.println("Las frases tienen la misma longitud.");
        } else if (relacion > 0) {
            System.out.println("La frase original es más larga por " + relacion + " letras.");
        } else {
            System.out.println("La frase ingresada es más larga por " + Math.abs(relacion) + " letras.");
        }
    }

    
}
