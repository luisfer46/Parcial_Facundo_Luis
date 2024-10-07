import java.util.ArrayList;

public class ArregloCliente {
    private ArrayList<Cliente> clientes;

    public ArregloCliente() {
        clientes = new ArrayList<>();
    }

    public boolean agregar(String RUC, String nombre, String email, String telefono) {
        Cliente cliente = new Cliente(RUC, nombre, email, telefono);
        return clientes.add(cliente);
    }

    public Cliente buscar(String RUC) {
        for (Cliente cliente : clientes) {
            if (cliente.getRUC().equals(RUC)) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente[] buscarNombre(String nombre) {
        ArrayList<Cliente> encontrados = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                encontrados.add(cliente);
            }
        }
        return encontrados.toArray(new Cliente[0]);
    }
}
