
import java.util.ArrayList;

public class ArregloGradoEstudio {
    private ArrayList<GradoEstudio> grados;

    public ArregloGradoEstudio() {
        grados = new ArrayList<>();
    }

    public boolean agregar(GradoEstudio grado) {
        return grados.add(grado);
    }

    public GradoEstudio buscar(String description) {
        for (GradoEstudio grado : grados) {
            if (grado.getDescription().equals(description)) {
                return grado;
            }
        }
        return null;
    }
}
