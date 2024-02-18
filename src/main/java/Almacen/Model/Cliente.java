package Almacen.Model;
// Se crea la clase Cliente
public class Cliente {

    // Atributos de la clase
    private String nombre;
    private String apellidos;
    private int id;
    private String direccion;
    private String telefono;

    // Constructor de la clase
    public Cliente(String nombre, String apellidos, int id, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // gettres y stters de la clase


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
