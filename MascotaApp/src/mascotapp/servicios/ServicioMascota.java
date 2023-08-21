package mascotapp.servicios;

import mascotapp.entidades.Mascota;

import java.util.Scanner;

public class ServicioMascota {

    /**
     * Este mmétodo no es coherente que esté dentro de la clase Mascota, puesto que una mascota no puede
     * crearse a sí misma, por eso se delega el método a una clase de servicio
     *
     * @param scanner
     * @return
     */
    public Mascota crearMascota(Scanner scanner) {

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apodo: ");
        String apodo = scanner.nextLine();

        System.out.print("Ingrese el tipo: ");
        String tipo = scanner.nextLine();

        return new Mascota(nombre, apodo, tipo);
    }
}
