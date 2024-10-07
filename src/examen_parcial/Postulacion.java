package examen_parcial;

import java.util.Date;

public class Postulacion {
    private Date fecha;
    private boolean anulado;
    private Date fechaAnulacion;
    private Oferta oferta;

    public Postulacion(Oferta oferta) {
        this.fecha = new Date();
        this.anulado = false;
        this.oferta = oferta;
    }

    public void anular() {
        this.anulado = true;
        this.fechaAnulacion = new Date();
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean isAnulado() {
        return anulado;
    }

    public Oferta getOferta() {
        return oferta;
    }
}
