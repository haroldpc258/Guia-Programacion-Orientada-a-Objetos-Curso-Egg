package ejercicio4.servicios;

import ejercicio4.entidades.NIF;

import java.util.Scanner;

public class NIFService {

    Scanner scanner = new Scanner(System.in);

    public NIF crearNif() {

        System.out.println("\nCreando DNI...");

        System.out.print("Ingrese el DNI: ");
        long dni = scanner.nextLong();

        String letra =  asignarLetra(dni);

        return new NIF(dni, letra);
    }
    public String asignarLetra(long dni) {

        String[] letraPosicion = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        int posicion = (int) (dni % 23);

        return letraPosicion[posicion];
    }


    public void mostrar(NIF nif) {
        System.out.println("\nEl NIF es el siguiente: " + nif.toString());
    }

}
