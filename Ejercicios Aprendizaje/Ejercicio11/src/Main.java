import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIngrese el año: ");
        int anio = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el dia: ");
        int dia = scanner.nextInt();

        Date fecha = new Date(anio-1900, mes-1, dia);
        Date fechaActual = new Date();

        System.out.println("La fecha es: " + fecha);

        int diferencia = Math.abs(fechaActual.getYear() - fecha.getYear());
        System.out.println("La diferencia en años de esa fecha y la fecha actual es: " + diferencia);
    }
}