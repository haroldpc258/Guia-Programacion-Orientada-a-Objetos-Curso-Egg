import entidades.Cliente;
import entidades.Rutina;
import servicios.ClienteService;
import servicios.RutinaService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ClienteService cs = new ClienteService();
        RutinaService rs = new RutinaService();

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Rutina> rutinas = new ArrayList<>();

        menuPrincipal(scanner, clientes, rutinas, cs, rs);
    }

    public static void menuPrincipal(Scanner scanner, ArrayList<Cliente> clientes, ArrayList<Rutina> rutinas, ClienteService cs, RutinaService rs) {

        int opcion = 1;
        while (opcion != 0) {
            System.out.println("\nMENÚ PRINCIPAL.");
            System.out.println("1. Clientes");
            System.out.println("2. Rutinas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuClientes(scanner, clientes, rutinas, cs, rs);
                    break;
                case 2:
                    menuRutinas(scanner, clientes, rutinas, cs, rs);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("La opción no es válida. Inténtelo de nuevo...");
            }
        }
    }

    public static void menuRutinas(Scanner scanner, ArrayList<Cliente> clientes, ArrayList<Rutina> rutinas, ClienteService cs, RutinaService rs) {

        int opcion = 1;
        while (opcion != 0) {
            System.out.println("\nMENÚ CLIENTES.");
            System.out.println("1. Registrar un Cliente");
            System.out.println("2. Obtener lista de Clientes");
            System.out.println("3. Actualizar información de un Cliente");
            System.out.println("4. Eliminar un Cliente");
            System.out.println("0. Atrás");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    clientes.add(cs.registrarCliente());
                    break;
                case 2:
                    if (clientes.size() > 0) {
                        cs.obtenerClientes(clientes);
                    }
                    break;
                case 3:
                    if (clientes.size() > 0) {
                        System.out.print("\nIngrese el ID del cliente a actualizar: ");
                        clientes = cs.actualizarCliente(scanner.nextInt(), clientes);
                    }
                    break;
                case 4:
                    if (clientes.size() > 0) {
                        System.out.print("\nIngrese el ID del cliente a eliminar: ");
                        clientes = cs.eliminarCliente(scanner.nextInt(), clientes);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("La opción no es válida. Inténtelo de nuevo...");
            }
        }
    }

    public static void menuClientes(Scanner scanner, ArrayList<Cliente> clientes, ArrayList<Rutina> rutinas, ClienteService cs, RutinaService rs) {

        int opcion = 1;
        while (opcion != 0) {
            System.out.println("\nMENÚ RUTINAS.");
            System.out.println("1. Crear una Rutina");
            System.out.println("2. Obtener lista de Rutinas");
            System.out.println("3. Actualizar una Rutina");
            System.out.println("4. Eliminar una Rutina");
            System.out.println("0. Atrás");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    rutinas.add(rs.crearRutina());
                    break;
                case 2:
                    if (rutinas.size() > 0) {
                        rs.obtenerRutina(rutinas);
                    }
                    break;
                case 3:
                    if (rutinas.size() > 0) {
                        System.out.print("\nIngrese el ID de la rutina a actualizar: ");
                        rutinas = rs.actualizarRutina(scanner.nextInt(), rutinas);
                    }
                    break;
                case 4:
                    if (rutinas.size() > 0) {
                        System.out.print("\nIngrese el ID de la rutina eliminar: ");
                        rutinas = rs.eliminarRutina(scanner.nextInt(), rutinas);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("La opción no es válida. Inténtelo de nuevo...");
            }
        }
    }
}

