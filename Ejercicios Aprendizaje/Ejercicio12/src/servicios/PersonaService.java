package servicios;

import entidades.Persona;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    public Persona crearPersona(Scanner scanner) {

        System.out.println("\nCreando una persona nueva...");
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el dia de nacimiento: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes de nacimiento: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año de nacimiento: ");
        int anio = scanner.nextInt();

        Date nacimiento =  new Date(anio-1900, mes-1, dia);

        return new Persona(nombre, nacimiento);
    }

    public void calcularEdad(Persona persona) {

        Date nacimiento = persona.getNacimiento();
        Date actual = new Date();

        int edad = Math.abs(nacimiento.getYear() - actual.getYear());

        System.out.println("La edad de la persona " + persona.getNombre() + " es " + edad + " años.");
    }

    public boolean menorQue(Persona persona, int edadComparar) {
        Date nacimiento = persona.getNacimiento();
        Date actual = new Date();

        int edad = Math.abs(nacimiento.getYear() - actual.getYear());

        return edad < edadComparar;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println(persona);
    }
}
