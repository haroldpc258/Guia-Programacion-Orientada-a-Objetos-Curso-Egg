import entidades.Persona;
import servicios.PersonaService;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PersonaService service = new PersonaService();

        Persona persona1 = service.crearPersona(scanner);
        service.calcularEdad(persona1);
        service.mostrarPersona(persona1);
        System.out.println(service.menorQue(persona1, 25));
    }
}