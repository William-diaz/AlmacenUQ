package Almacen.Model;

// Se crea la clase Producto Refrigerado que hereda de la clase Producto
public class ProductoRefrigerado extends Producto {

    // Atributos de la clase
    private int codigoAprobacion;
    private int temperaturaRecomendada;

    // Constuctor de la clase

    public ProductoRefrigerado(String nombre, int idProducto, String descripcion, float valorunitario,
                               int cantidadExistencia, int codigoAprobacion, int temperaturaRecomendada) {
        super(nombre, idProducto, descripcion, valorunitario, cantidadExistencia);
        this.codigoAprobacion = codigoAprobacion;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }


    // getters y setters de la clase


    public int getCodigoAprobacion() {
        return codigoAprobacion;
    }

    public void setCodigoAprobacion(int codigoAprobacion) {
        this.codigoAprobacion = codigoAprobacion;
    }

    public int getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(int temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
}
