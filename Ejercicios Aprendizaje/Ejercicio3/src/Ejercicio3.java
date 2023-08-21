import ejercicio3.entidades.Operacion;
import ejercicio3.servicios.OperacionService;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        OperacionService service = new OperacionService();

        Operacion operacion1 = service.crearOperacion(scanner);

        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\nMENU.");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    service.sumar(operacion1);
                    break;
                case 2:
                    service.restar(operacion1);
                    break;
                case 3:
                    service.multiplicar(operacion1);
                    break;
                case 4:
                    service.dividir(operacion1, scanner);
                    break;
                case 5:
                    break;
                default:
                    System.err.println("La opción no es válida, inténtelo nuevamente. \n");
                    scanner.nextLine();
            }
        }
    }
}