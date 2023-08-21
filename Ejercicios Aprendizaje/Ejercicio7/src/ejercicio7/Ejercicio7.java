package ejercicio7;

import ejercicio7.entidades.Persona;
import ejercicio7.servicios.PersonaService;

public class Ejercicio7 {
    public static void main(String[] args) {

        PersonaService service = new PersonaService();

        Persona persona1 = service.crearPersona();
        service.calcularIMC(persona1);
        service.esMayorDeEdad(persona1);
    }
}