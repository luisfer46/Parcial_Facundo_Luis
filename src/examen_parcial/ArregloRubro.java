import java.util.ArrayList;

public class ArregloRubro {
    private ArrayList<Rubro> rubros;

    public ArregloRubro() {
        rubros = new ArrayList<>();
    }

    public boolean agregar(Rubro rubro) {
        return rubros.add(rubro);
    }

    public Rubro buscar(String nombre) {
        for (Rubro rubro : rubros) {
            if (rubro.getNombre().equals(nombre)) {
                return rubro;
            }
        }
        return null;
    }
}
