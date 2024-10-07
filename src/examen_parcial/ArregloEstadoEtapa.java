import java.util.ArrayList;

public class ArregloEstadoEtapa {
    private ArrayList<EstadoEtapa> estados;

    public ArregloEstadoEtapa() {
        estados = new ArrayList<>();
    }

    public boolean agregar(EstadoEtapa estado) {
        return estados.add(estado);
    }

    public EstadoEtapa buscar(String nombre) {
        for (EstadoEtapa estado : estados) {
            if (estado.getNombre().equals(nombre)) {
                return estado;
            }
        }
        return null;
    }
}
