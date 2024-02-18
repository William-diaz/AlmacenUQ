package Almacen.Model;

// SE crea la clase Cliente Juridico que herda de la clase Cliente
public class ClienteJuridico extends Cliente {

    // Atributo de la clase
    private int nit;

    // Constructor de la clase

    public ClienteJuridico(String nombre, String apellidos, int id, String direccion, String telefono, int nit) {
        super(nombre, apellidos, id, direccion, telefono);
        this.nit = nit;
    }

    // getters y setters de la clase
    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
}
