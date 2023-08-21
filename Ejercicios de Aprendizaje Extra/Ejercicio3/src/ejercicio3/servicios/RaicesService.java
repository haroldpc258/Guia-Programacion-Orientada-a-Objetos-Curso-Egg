package ejercicio3.servicios;

import ejercicio3.entidades.Raices;

import java.util.Scanner;

public class RaicesService {

    Scanner scanner = new Scanner(System.in);

    public Raices crearEcuacion() {

        System.out.println("\nSe está creando una nueva ecuación de segundo grado...");

        System.out.print("Ingrese el valor para el coeficiente a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor para el coeficiente b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor para el coeficiente c: ");
        double c = scanner.nextDouble();

        return new Raices(a, b, c);
    }

    public boolean tieneRaices(Raices ecuacion) {

        return ecuacion.getDiscriminante() > 0;
    }

    public boolean tieneRaiz(Raices ecuacion) {

        return ecuacion.getDiscriminante() == 0;
    }

    public void obtenerRaices(Raices ecuacion) {

        double raiz1 = ecuacion.calcularRaices()[0];
        double raiz2 = ecuacion.calcularRaices()[1];

        System.out.println("Las dos soluciones posibles para esta ecuación son: X=" + raiz1 + ", y X=" + raiz2);
    }

    public void obtenerRaiz(Raices ecuacion) {

        double raiz1 = ecuacion.calcularRaices()[0];

        System.out.println("La solución posible para esta ecuación es: X=" + raiz1);
    }

    public void calcular(Raices ecuacion) {

        if (tieneRaices(ecuacion)) {
            obtenerRaices(ecuacion);
        } else if (tieneRaiz(ecuacion)) {
            obtenerRaiz(ecuacion);
        } else {
            System.out.println("La ecuación no tiene solución :(");
        }
    }

}
