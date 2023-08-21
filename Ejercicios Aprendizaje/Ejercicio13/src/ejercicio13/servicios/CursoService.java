package ejercicio13.servicios;

import ejercicio13.entidades.Curso;

import java.util.Scanner;

public class CursoService {

    Scanner scanner = new Scanner(System.in);

    public Curso crearCurso() {

        Curso curso = new Curso();
        System.out.println("\nCreando curso nuevo...");

        System.out.print("Ingrese nombre del curso: ");
        curso.setNombreCurso(scanner.nextLine());

        System.out.print("Ingrese La cantidad de horas por día: ");
        curso.setCantidadHorasPorDia(scanner.nextDouble());

        System.out.print("Ingrese La cantidad de días por semana: ");
        curso.setCantidadDiasPorSemana(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Ingrese el turno en el que se tomará el curso: ");
        curso.setTurno(scanner.nextLine());

        System.out.print("Ingrese el precio por hora: ");
        curso.setPrecioPorHora(scanner.nextDouble());
        scanner.nextLine();

        curso = cargarAlumnos(curso);

        return curso;
    }

    public Curso cargarAlumnos(Curso curso) {

        String[] alumnos = curso.getAlumnos();
        int cantidadAlumnos = alumnos.length;

        System.out.println("\nAhora ingrese la información de los alumnos.");
        for (int i = 0; i < cantidadAlumnos; i++) {

            System.out.println("\nAlumno " + i+1);
            System.out.print("Indique el nombre del alumno: ");
            alumnos[i] = scanner.nextLine();
        }

        return curso;
    }

    public void gananciaSemanalCurso(Curso curso) {

        System.out.println("La ganancia que recibes cada semana producto de este curso es: " + curso.calcularGananciaSemanal());
    }
}
