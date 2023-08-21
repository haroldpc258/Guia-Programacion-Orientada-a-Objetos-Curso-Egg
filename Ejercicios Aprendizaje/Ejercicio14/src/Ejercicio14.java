import ejercicio14.entidades.Movil;
import ejercicio14.servicios.MovilService;

public class Ejercicio14 {
    public static void main(String[] args) {

        MovilService service = new MovilService();

        Movil movil1 = service.cargarCelular();

        service.mostrarMovil(movil1);
    }
}