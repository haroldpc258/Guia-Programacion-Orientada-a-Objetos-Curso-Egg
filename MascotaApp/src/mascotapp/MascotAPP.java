package mascotapp;

import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

import java.util.Scanner;

public class MascotAPP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       /* Mascota mascota1 = new Mascota();

        mascota1.apodo = "Chiquito";
        mascota1.nombre = scanner.nextLine();
        mascota1.tipo = "Perro";
        mascota1.edad = 14;
        mascota1.raza = "Beagle";
        mascota1.cola = true;
        mascota1.color = "Tricolor";

        System.out.println(mascota1.nombre+" "+mascota1.apodo+" "+mascota1.edad+" "+mascota1.tipo+" "+mascota1.raza);*/




        /*Mascota mascota1 = new Mascota("Fernando Chiquito", scanner.nextLine(), "Perro");

        System.out.println(mascota1);
        mascota1.setNombre("Pepe Chiquito");

        System.out.println(mascota1.getNombre());

        System.out.println(mascota1);

        mascota1.pasear(200);
        System.out.println(mascota1);

        mascota1.pasear(100, 4);
        System.out.println(mascota1);*/





        ServicioMascota servicioMascota = new ServicioMascota();

        Mascota mascota1 = servicioMascota.crearMascota(scanner);
        System.out.println(mascota1);
    }
}
