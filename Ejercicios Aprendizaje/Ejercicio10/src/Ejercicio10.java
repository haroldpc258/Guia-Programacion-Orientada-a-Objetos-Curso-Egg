import entidades.Arreglo;
import servicios.ArregloService;

public class Ejercicio10 {
    public static void main(String[] args) {

        ArregloService service = new ArregloService();

        Arreglo A = service.crearArreglo(50);
        Arreglo B = service.crearArreglo(20);

        A = service.inicializarArregloRandom(A);
        service.mostrarArreglo(A);

        A = service.ordenarArreglo(A);

        B = service.inicializarArregloB(A, B);

        service.mostrarArreglo(A);
        service.mostrarArreglo(B);
    }
}