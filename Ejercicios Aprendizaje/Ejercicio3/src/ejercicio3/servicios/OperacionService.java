package ejercicio3.servicios;

import ejercicio3.entidades.Operacion;

import java.util.Scanner;

public class OperacionService {

    public Operacion crearOperacion(Scanner scanner) {

        System.out.print("Ingrese el primer número: ");
        Double numero1 = scanner.nextDouble();
        System.out.print("Ingrese el primer número: ");
        Double numero2 = scanner.nextDouble();

        return new Operacion(numero1, numero2);
    }

    public void sumar(Operacion numeros) {
        Double numero1 = numeros.getNumero1();
        Double numero2 = numeros.getNumero2();
        Double suma = numero1 + numero2;

        System.out.println("El resultado de la suma es: " + suma);
    }

    public void restar(Operacion numeros) {
        Double numero1 = numeros.getNumero1();
        Double numero2 = numeros.getNumero2();
        Double resta = numero1 - numero2;

        System.out.println("El resultado de la resta es: " + resta);
    }

    public void multiplicar(Operacion numeros) {
        Double numero1 = numeros.getNumero1();
        Double numero2 = numeros.getNumero2();
        Double multiplicacion = numero1 * numero2;

        System.out.println("El resultado de la multiplicación es: " + multiplicacion);
    }

    public void dividir(Operacion numeros, Scanner scanner) {
        Double numero1 = numeros.getNumero1();
        Double numero2 = numeros.getNumero2();

        if (numero2 == 0) {
            System.err.println("No se puede realizar la operación, no se puede dividir por 0.\n");
            scanner.nextLine();
        } else {

            Double division = numero1 / numero2;

            System.out.println("El resultado de la división es: " + division);
        }
    }
}
