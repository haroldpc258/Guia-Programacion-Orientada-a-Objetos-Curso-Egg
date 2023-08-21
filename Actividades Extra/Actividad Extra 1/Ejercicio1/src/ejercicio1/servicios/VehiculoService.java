package ejercicio1.servicios;

import ejercicio1.entidades.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehiculoService {

    private List<Vehiculo> vehiculos;

    public VehiculoService() {
        vehiculos = new ArrayList<>();
    }

    public Vehiculo crearVehiculo(Scanner scanner) {

        Vehiculo vehiculo = new Vehiculo();

        System.out.println("\nA continuación deberá ingresar la información del vehículo.");

        System.out.print("Ingrese la marca del vehículo: ");
        vehiculo.setMarca(scanner.nextLine());

        System.out.print("Ingrese el modelo del vehículo: ");
        vehiculo.setModelo(scanner.nextLine());

        System.out.print("Ingrese año de fabricación del vehículo: ");
        vehiculo.setAnio(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Ingrese el tipo de vehículo: ");
        String tipo = scanner.nextLine();

        while (!tipo.equalsIgnoreCase("auto") && !tipo.equalsIgnoreCase("moto") && !tipo.equalsIgnoreCase("bici")) {
            System.out.println("No se puede crear un vehículo de este tipo.\n");
            System.out.print("Ingrese un tipo de vehículo válido: ");
            tipo = scanner.nextLine();
        }
        vehiculo.setTipo(tipo);

        switch (tipo.toLowerCase()) {
            case "auto":
                vehiculo.setVelocidad(3);
                vehiculo.setMetrosFrenado(2);
                break;
            case "moto":
                vehiculo.setVelocidad(2);
                vehiculo.setMetrosFrenado(2);
                break;
            case "bici":
                vehiculo.setVelocidad(1);
                vehiculo.setMetrosFrenado(0);
                break;
        }

        vehiculos.add(vehiculo);

        return vehiculo;
    }

    public void mostrarVehiculo(Vehiculo vehiculo) {
        System.out.println("\nInformación del vehículo.");
        System.out.println(vehiculo);
    }

    public Vehiculo moverse(Vehiculo vehiculo, Integer segundos) {

        int metrosRecorridos = vehiculo.getMetrosRecorridos() + (vehiculo.getVelocidad()*segundos);

        vehiculo.setMetrosRecorridos(metrosRecorridos);

        System.out.println("\nEl vehículo " + vehiculo.getTipo() + " ha avanzado " + metrosRecorridos + " metros.");

        return vehiculo;
    }

    public Vehiculo frenar(Vehiculo vehiculo) {

        int metrosRecorridos = vehiculo.getMetrosRecorridos() + vehiculo.getMetrosFrenado();

        vehiculo.setMetrosRecorridos(metrosRecorridos);

        System.out.println("\nEl vehículo " + vehiculo.getTipo() + " se ha detenido.");

        return vehiculo;
    }

    public Vehiculo reinicarDesplazamiento(Vehiculo vehiculo) {
        vehiculo.setMetrosRecorridos(0);

        return vehiculo;
    }

    public void masLejos() {

        int maximo = 0;
        int indice = 0;
        for (Vehiculo vehiculo : vehiculos) {

            if (vehiculo.getMetrosRecorridos() > maximo) {
                maximo = vehiculo.getMetrosRecorridos();
                indice = vehiculos.indexOf(vehiculo);
            }
        }

        System.out.println("\nEl vehículo que llegó más lejos fue: ");
        mostrarVehiculo(vehiculos.get(indice));
    }


}
