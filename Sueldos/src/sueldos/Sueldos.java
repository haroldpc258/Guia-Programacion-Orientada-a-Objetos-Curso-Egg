package sueldos;

import sueldos.entidades.Vendedor;
import sueldos.servicios.ServicioVendedor;

import java.util.Scanner;

public class Sueldos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ServicioVendedor servicioVendedor = new ServicioVendedor();

        Vendedor vendedor1 = servicioVendedor.crearVendedor(scanner);
        servicioVendedor.sueldoMensual(scanner, vendedor1);
        servicioVendedor.vacaciones(vendedor1);
        System.out.println(vendedor1);
    }
}
