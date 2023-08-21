import ejercicio1.entidades.Vehiculo;
import ejercicio1.servicios.VehiculoService;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        VehiculoService vehiculoService = new VehiculoService();

        Vehiculo vehiculo1 = vehiculoService.crearVehiculo(scanner);
        Vehiculo vehiculo2 = vehiculoService.crearVehiculo(scanner);
        Vehiculo vehiculo3 = vehiculoService.crearVehiculo(scanner);

        vehiculoService.mostrarVehiculo(vehiculo1);
        vehiculoService.mostrarVehiculo(vehiculo2);
        vehiculoService.mostrarVehiculo(vehiculo3);

        vehiculo1 = vehiculoService.moverse(vehiculo1, 5);
        vehiculo2 = vehiculoService.moverse(vehiculo2, 10);
        vehiculo3 = vehiculoService.moverse(vehiculo3, 60);

        vehiculo1 = vehiculoService.reinicarDesplazamiento(vehiculo1);
        vehiculo2 = vehiculoService.reinicarDesplazamiento(vehiculo2);
        vehiculo3 = vehiculoService.reinicarDesplazamiento(vehiculo3);

        vehiculoService.mostrarVehiculo(vehiculo1);
        vehiculoService.mostrarVehiculo(vehiculo2);
        vehiculoService.mostrarVehiculo(vehiculo3);

        vehiculo1 = vehiculoService.moverse(vehiculo1, 5*60);
        vehiculo2 = vehiculoService.moverse(vehiculo2, 5*60);
        vehiculo3 = vehiculoService.moverse(vehiculo3, 5*60);

        vehiculo1 = vehiculoService.frenar(vehiculo1);
        vehiculo2 = vehiculoService.frenar(vehiculo2);
        vehiculo3 = vehiculoService.frenar(vehiculo3);

        vehiculoService.mostrarVehiculo(vehiculo1);
        vehiculoService.mostrarVehiculo(vehiculo2);
        vehiculoService.mostrarVehiculo(vehiculo3);

        vehiculoService.masLejos();
    }
}