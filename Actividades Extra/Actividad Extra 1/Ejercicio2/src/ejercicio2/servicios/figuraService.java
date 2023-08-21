package ejercicio2.servicios;

import ejercicio2.entidades.Circulo;

import java.util.Scanner;

public class figuraService {

    Scanner leer = new Scanner(System.in);

    public Circulo crearCirculo() {

        System.out.print("Ingrese el radio del Circulo: ");
        Double radio = leer.nextDouble();

        return new Circulo(radio);
    }

    public void perimetroCirculo(Circulo circulo) {
        Double perimetro = 2*Math.PI*circulo.getRadio();
        System.out.println("El valor del perímetro del círculo es: " + perimetro);
    }

    public void areaCirculo(Circulo circulo) {
        Double area = Math.PI*Math.pow(circulo.getRadio(), 2);
        System.out.println("El área del círculo es: " + area);
    }
}
