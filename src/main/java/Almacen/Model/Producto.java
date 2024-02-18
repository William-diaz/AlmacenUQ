package Almacen.Model;
// Se crea la clase de Producto
public class Producto {

    // Atributos de la clase
    private String nombre;
    private int idProducto;
    private String descripcion;
    private float valorunitario;
    private int cantidadExistencia;

    // Constructor de la clase:

    public Producto(String nombre, int idProducto, String descripcion, float valorunitario, int cantidadExistencia) {
        this.nombre = nombre;
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.valorunitario = valorunitario;
        this.cantidadExistencia = cantidadExistencia;
    }

    // getters y setters de la clase


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(float valorunitario) {
        this.valorunitario = valorunitario;
    }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }
}
