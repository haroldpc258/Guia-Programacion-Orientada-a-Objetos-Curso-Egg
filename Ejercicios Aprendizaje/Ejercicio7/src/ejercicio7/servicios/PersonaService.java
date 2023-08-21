package ejercicio7.servicios;

import ejercicio7.entidades.Persona;

import java.util.Scanner;

public class PersonaService {

    Scanner scanner = new Scanner(System.in);
    public Persona crearPersona() {

        System.out.println("\nCreando una persona nueva...");

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el sexo: ");
        String aux = scanner.nextLine();
        char sexo = aux.charAt(0);

        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {

            System.out.println("El valor ingresado no es válido...\n");

            System.out.print("Inténtelo nuevamente.\nIngrese el sexo: ");
            aux = scanner.nextLine();
            sexo = aux.charAt(0);
        }

        System.out.print("Ingrese el peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la altura: ");
        double altura = scanner.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public void calcularIMC(Persona persona) {

        int imc = persona.calcularIMC();

        if (imc == -1) {
            System.out.println("La persona está por debajo de su peso ideal.");
        } else if (imc == 1) {
            System.out.println("La persona tiene sobrepeso.");
        } else {
            System.out.println("La persona está en su peso ideal.");
        }
    }

    public void esMayorDeEdad(Persona persona) {

        boolean mayorDeEdad = persona.esMayorDeEdad();

        if (mayorDeEdad) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }
    }
}
