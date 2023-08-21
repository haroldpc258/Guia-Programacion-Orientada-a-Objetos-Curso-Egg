package servicios;

import entidades.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteService {

    Scanner scannerTxt = new Scanner(System.in);
    Scanner scannerNum = new Scanner(System.in);

    public Cliente registrarCliente() {

        System.out.println("\nREGISTRO DE CLIENTE...");
        System.out.print("Ingrese un ID para el cliente: ");
        int id = scannerNum.nextInt();

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scannerTxt.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scannerNum.nextInt();

        System.out.print("Ingrese la altura: ");
        double altura = scannerNum.nextDouble();

        System.out.print("Ingrese el peso: ");
        double peso = scannerNum.nextDouble();

        System.out.print("Ingrese el objetivo: ");
        String objetivo = scannerTxt.nextLine();

        return new Cliente(id, nombre, edad, altura, peso, objetivo);
    }

    public void obtenerClientes(ArrayList<Cliente> clientes) {

        System.out.println("\nLISTA DE CLIENTES...");
        for (Cliente cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }

    public ArrayList<Cliente> actualizarCliente(int id, ArrayList<Cliente> clientes) {

        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clientes.set(clientes.indexOf(cliente), registrarCliente());
            }
        }

        return clientes;
    }

    public ArrayList<Cliente> eliminarCliente(int id, ArrayList<Cliente> clientes) {

        Cliente clienteEliminar = null;
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clienteEliminar = cliente;
                break;
            }
        }

        if (clienteEliminar != null) {
            clientes.remove(clienteEliminar);
        }

        return clientes;
    }

}
