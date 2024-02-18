package Almacen.Model;

import java.util.Date;

// Se crea la clase Producto Envasado que hereda de la clase Producto
public class ProductoEnvasado extends Producto {

    // Atributos de la clase
    private Date fevhaEnvasado;
    private float pesoEnvase;
    private PaisOrigen paisOrigen;

    // Se crea el constructor de la clase
    public ProductoEnvasado(String nombre, int idProducto, String descripcion, float valorunitario,
                            int cantidadExistencia, Date fevhaEnvasado, float pesoEnvase, PaisOrigen paisOrigen) {
        super(nombre, idProducto, descripcion, valorunitario, cantidadExistencia);
        this.fevhaEnvasado = fevhaEnvasado;
        this.pesoEnvase = pesoEnvase;
        this.paisOrigen = paisOrigen;
    }

    // getters y setters de la clase

    public Date getFevhaEnvasado() {
        return fevhaEnvasado;
    }

    public void setFevhaEnvasado(Date fevhaEnvasado) {
        this.fevhaEnvasado = fevhaEnvasado;
    }

    public float getPesoEnvase() {
        return pesoEnvase;
    }

    public void setPesoEnvase(float pesoEnvase) {
        this.pesoEnvase = pesoEnvase;
    }

    public PaisOrigen getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(PaisOrigen paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
