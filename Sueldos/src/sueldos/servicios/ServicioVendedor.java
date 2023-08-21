package sueldos.servicios;

import sueldos.entidades.Vendedor;

import java.util.Date;
import java.util.Scanner;

public class ServicioVendedor {

    public Vendedor crearVendedor(Scanner scanner) {

        // Se instancia un objeto de tipo vendedor
        Vendedor vendedor = new Vendedor();

        // Se llenan los atributos
        System.out.print("Ingrese el nombre del vendedor: ");
        vendedor.setNombre(scanner.nextLine());

        System.out.print("Ingrese el DNI del vendedor: ");
        vendedor.setDni(scanner.nextInt());

        System.out.print("Ingrese el sueldo básico del vendedor: ");
        vendedor.setSueldoBasico(scanner.nextDouble());

        System.out.print("Ingrese el día en el que empezó a trabajar: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes en el que empezó a trabajar: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año en el que empezó a trabajar: ");
        int anio = scanner.nextInt();

        Date fecha = new Date(anio-1900, mes-1, dia);

        vendedor.setFechaInicio(fecha);

        return vendedor;
    }

    public void sueldoMensual(Scanner scanner, Vendedor vendedor) {

        System.out.print("Ingrese lo recaudado en ventas totales del vendedor: ");
        Double ventas = scanner.nextDouble();
        vendedor.setComisiones(ventas * 0.15);
        vendedor.setSueldoMensual(vendedor.getSueldoBasico() + vendedor.getComisiones());
        System.out.println("El sueldo mensual de vendedor: " +
                vendedor.getNombre() + ", es de :" + vendedor.getSueldoMensual());
    }

    public void vacaciones(Vendedor vendedor) {

        Date hoy = new Date();
        int antiguedad = hoy.getYear() - vendedor.getFechaInicio().getYear();

        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 días de vacaciones.");
        } else if (antiguedad < 10) {
            System.out.println("Le corresponden 21 días de vacaciones.");
        } else if (antiguedad < 20) {
            System.out.println("Le corresponden 28 días de vacaciones.");
        } else if (antiguedad > 20) {
            System.out.println("Le corresponden 35 días de vacaciones.");
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales.");
        }
    }
}
