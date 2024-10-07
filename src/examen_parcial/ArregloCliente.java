package examen_parcial;

import java.util.ArrayList;

public class ArregloCliente {
    private ArrayList<Cliente> clientes;

    public ArregloCliente() {
        clientes = new ArrayList<>();
    }

    // Método para agregar un cliente
    public boolean agregar(String RUC, String nombre, String email, String telefono, String clave) {
        Cliente cliente = new Cliente(RUC, nombre, email, telefono, clave);
        return clientes.add(cliente);
    }

    // Método para buscar un cliente por RUC
    public Cliente buscar(String RUC) {
        for (Cliente cliente : clientes) {
            if (cliente.getRUC().equals(RUC)) {
                return cliente;
            }
        }
        return null;
    }

    // Método para buscar clientes por nombre (devolver arreglo)
    public Cliente[] buscarNombre(String nombre) {
        ArrayList<Cliente> encontrados = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                encontrados.add(cliente);
            }
        }
        return encontrados.toArray(new Cliente[0]);
    }

    // Método para obtener todos los clientes
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
