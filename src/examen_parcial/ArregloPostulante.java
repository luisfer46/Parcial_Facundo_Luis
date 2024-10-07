package examen_parcial;

import java.util.ArrayList;

public class ArregloPostulante {
    private ArrayList<Postulante> postulantes;

    public ArregloPostulante() {
        postulantes = new ArrayList<>();
    }

    public boolean agregar(Postulante postulante) {
        return postulantes.add(postulante);
    }

    public Postulante buscar(String DNI) {
        for (Postulante postulante : postulantes) {
            if (postulante.getDNI().equals(DNI)) {
                return postulante;
            }
        }
        return null;
    }
}
