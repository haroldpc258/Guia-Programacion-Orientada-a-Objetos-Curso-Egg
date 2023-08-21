package servicios;

import entidades.Cliente;
import entidades.Rutina;

import java.util.ArrayList;
import java.util.Scanner;

public class RutinaService {

    Scanner scannerTxt = new Scanner(System.in);
    Scanner scannerNum = new Scanner(System.in);

    public Rutina crearRutina() {

        System.out.println("\nREGISTRO DE RUTINA...");
        System.out.print("Ingrese un ID para la Rutina: ");
        int id = scannerNum.nextInt();

        System.out.print("Ingrese el nombre de la Rutina: ");
        String nombre = scannerTxt.nextLine();

        System.out.print("Ingrese la duración: ");
        int duracion = scannerNum.nextInt();

        System.out.print("Ingrese la dificultad: ");
        int dificultad = scannerNum.nextInt();

        System.out.print("Ingrese una descripción: ");
        String descripcion = scannerTxt.nextLine();

        return new Rutina(id, nombre, duracion, dificultad, descripcion);
    }

    public void obtenerRutina(ArrayList<Rutina> rutinas) {

        System.out.println("\nLISTA DE RUTINAS...");
        for (Rutina rutina : rutinas) {
            System.out.println(rutina.toString());
        }
    }

    public ArrayList<Rutina> actualizarRutina(int id, ArrayList<Rutina> rutinas) {

        for (Rutina rutina : rutinas) {
            if (rutina.getId() == id) {
                rutinas.set(rutinas.indexOf(rutina), crearRutina());
            }
        }

        return rutinas;
    }

    public ArrayList<Rutina> eliminarRutina(int id, ArrayList<Rutina> rutinas) {

        Rutina rutinaEliminar = null;
        for (Rutina rutina : rutinas) {
            if (rutina.getId() == id) {
                rutinaEliminar = rutina;
                break;
            }
        }

        if (rutinaEliminar != null) {
            rutinas.remove(rutinaEliminar);
        }

        return rutinas;
    }
}
