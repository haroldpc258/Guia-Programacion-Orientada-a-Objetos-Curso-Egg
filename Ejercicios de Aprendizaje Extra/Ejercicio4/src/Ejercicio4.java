import ejercicio4.entidades.NIF;
import ejercicio4.servicios.NIFService;

public class Ejercicio4 {
    public static void main(String[] args) {

        NIFService service = new NIFService();

        NIF nif1 = service.crearNif();

        service.mostrar(nif1);
    }
}