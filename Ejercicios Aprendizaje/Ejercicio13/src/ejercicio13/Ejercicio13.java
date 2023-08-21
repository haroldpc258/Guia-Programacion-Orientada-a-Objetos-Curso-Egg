package ejercicio13;

import ejercicio13.entidades.Curso;
import ejercicio13.servicios.CursoService;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        CursoService service = new CursoService();

        Curso matematicas = service.crearCurso();

        service.gananciaSemanalCurso(matematicas);
    }
}