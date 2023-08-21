import ejercicio3.entidades.Raices;
import ejercicio3.servicios.RaicesService;

public class Ejercicio3 {
    public static void main(String[] args) {

        RaicesService service = new RaicesService();

        Raices ecuacion1 = service.crearEcuacion();

        service.calcular(ecuacion1);
    }
}