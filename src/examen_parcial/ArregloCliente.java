package examen_parcial;

import java.util.ArrayList;

public class ArregloCliente {
    private ArrayList<Cliente> clientes;

    // Constructor
    public ArregloCliente() {
        clientes = new ArrayList<>();
    }

    // Método para agregar un cliente al arreglo
    public boolean agregar(String RUC, String nombre, String email, String telefono, String clave) {
        Cliente cliente = new Cliente(RUC, nombre, email, telefono, clave);
        return clientes.add(cliente);
    }

    // Método para buscar un cliente por su RUC
    public Cliente buscar(String RUC) {
        for (Cliente cliente : clientes) {
            if (cliente.getRUC().equals(RUC)) {
                return cliente;
            }
        }
        return null; // Devuelve null si no encuentra al cliente
    }

    // Método para buscar un cliente por su nombre (opcional)
    public Cliente[] buscarNombre(String nombre) {
        ArrayList<Cliente> encontrados = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                encontrados.add(cliente);
            }
        }
        return encontrados.toArray(new Cliente[0]);
    }

    // Método para obtener todos los clientes (opcional)
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
