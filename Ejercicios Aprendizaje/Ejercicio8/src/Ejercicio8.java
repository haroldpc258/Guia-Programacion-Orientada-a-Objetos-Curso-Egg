import ejercicio8.entidades.Cadena;
import ejercicio8.servicios.CadenaService;

public class Ejercicio8 {
    public static void main(String[] args) {

        CadenaService service = new CadenaService();

        Cadena cadena1 = service.crearCadena();

        service.mostrarVocales(cadena1);

        cadena1 = service.invertirFrase(cadena1);

        service.vecesRepetido(cadena1);

        service.compararLongitud(cadena1);
    }
}