package examen_parcial;

import java.util.ArrayList;

public class Cliente {
    private String RUC;
    private String nombre;
    private String email;
    private String telefono;
    private String clave;
    private ArrayList<Oferta> ofertas;
    private ArrayList<Contacto> contactos;

    public Cliente(String RUC, String nombre, String email, String telefono, String clave) {
        this.RUC = RUC;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.clave = clave;
        this.ofertas = new ArrayList<>();
        this.contactos = new ArrayList<>();
    }

    // Agregar oferta al cliente
    public boolean agregarOferta(Oferta oferta) {
        return ofertas.add(oferta);
    }

    // Eliminar oferta
    public boolean eliminarOferta(Oferta oferta) {
        return ofertas.remove(oferta);
    }

    // Obtener las ofertas del cliente
    public ArrayList<Oferta> getOfertas() {
        return ofertas;
    }

    // Registrar contacto asociado al cliente
    public void registrarContacto(String DNI, String nombres, String apellidos, String puesto) {
        Contacto contacto = new Contacto(DNI, nombres, apellidos, puesto);
        contactos.add(contacto);
    }

    public String getRUC() {
        return RUC;
    }

    public String getNombre() {
        return nombre;
    }
}
