package Almacen.Model;

import java.util.Date;
// Se crea la clase de Producto perecedor que hereda de la clase producto
public class ProductoPerecedor extends Producto {

    // Atributo de la clase
    private Date fechaVencimiento;

    // Constructor de la clase
    public ProductoPerecedor(String nombre, int idProducto, String descripcion, float valorunitario,
                             int cantidadExistencia, Date fechaVencimiento) {
        super(nombre, idProducto, descripcion, valorunitario, cantidadExistencia);
        this.fechaVencimiento = fechaVencimiento;
    }

    // getters y setters de la clase
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
