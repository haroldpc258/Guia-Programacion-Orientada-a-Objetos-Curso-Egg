package ejercicio14.servicios;

import ejercicio14.entidades.Movil;

import java.util.Scanner;

public class MovilService {

    Scanner scanner = new Scanner(System.in);

    public Movil cargarCelular() {

        Movil movil = new Movil();

        System.out.println("\nCreando un equipo nuevo...");

        System.out.print("Ingrese la marca: ");
        movil.setMarca(scanner.nextLine());

        System.out.print("Ingrese el modelo: ");
        movil.setModelo(scanner.nextLine());

        System.out.print("Ingrese el precio: ");
        movil.setPrecio(scanner.nextDouble());

        System.out.print("Ingrese la memoria RAM: ");
        movil.setMemoriaRam(scanner.nextInt());

        System.out.print("Ingrese el almacenamiento: ");
        movil.setAlmacenamiento(scanner.nextInt());

        movil = ingresarCodigo(movil);

        return movil;
    }

    public Movil ingresarCodigo(Movil movil) {

        int[] codigo = movil.getCodigo();

        System.out.println("Ingrese el código del equipo.");
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("Ingrese el número " + (i+1) + " del código: ");
            codigo[i] = scanner.nextInt();
        }

        return movil;
    }

    public void mostrarMovil(Movil movil) {
        System.out.println(movil);
    }

}
