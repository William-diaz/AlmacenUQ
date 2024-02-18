package Controlador;
import Almacen.Model.Cliente;
import Almacen.Model.Producto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ProductoController {

    @FXML
    private Button botonCrear;

    @FXML
    private Button botonEliminar;

    @FXML
    private Button botonVolver;

    @FXML
    private TableColumn<?, ?> columnaCantidadExistencia;

    @FXML
    private TableColumn<?, ?> columnaCodigoAprobacion;

    @FXML
    private TableColumn<?, ?> columnaDescripcion;

    @FXML
    private TableColumn<?, ?> columnaFechaEnvase;

    @FXML
    private TableColumn<?, ?> columnaFechaVencimiento;

    @FXML
    private TableColumn<?, ?> columnaNombre;

    @FXML
    private TableColumn<?, ?> columnaPaisOrigen;

    @FXML
    private TableColumn<?, ?> columnaPesoEnvaso;

    @FXML
    private TableColumn<?, ?> columnaProducto;

    @FXML
    private TableColumn<?, ?> columnaTemperaturaRecomendada;

    @FXML
    private TableColumn<?, ?> columnaValorUnitario;

    @FXML
    private DatePicker comboBoxFechaEnvasado;

    @FXML
    private DatePicker comboBoxFechaVencimiento;

    @FXML
    private TextField textFieldCantidadExistencia;

    @FXML
    private TextField textFieldCodigoAprobacion;

    @FXML
    private TextField textFieldDescripcion;

    @FXML
    private TextField textFieldNombre;

    @FXML
    private TextField textFieldPesoEnvase;

    @FXML
    private TextField textFieldIdProducto;

    @FXML
    private TextField textFieldTemperaturaRecomendada;

    @FXML
    private TextField textFieldValorUnitario;

    // Evento para volver a la pagina principal
    @FXML
    void showAlmacen(ActionEvent event) {

    }

    // Se crea una lista de Productos para capturar los datos
    private ArrayList<String> listaProductos = new ArrayList<>();

    // Metodo para capturar/guardar los datos
    @FXML
    private void guardarDatos() {
        String nombre = textFieldNombre.getText();
        String idProducto = textFieldIdProducto.getText();
        String descripcion = textFieldDescripcion.getText();
        String valorUnitario = textFieldValorUnitario.getText();
        String cantidadExistencia = textFieldCantidadExistencia.getText();
        String temperaturaRecomendada = textFieldTemperaturaRecomendada.getText();
        String codigoAprobacion = textFieldCodigoAprobacion.getText();
        String pesoEnvase = textFieldPesoEnvase.getText();
        String fechaVencimiento = String.valueOf(comboBoxFechaVencimiento.getTooltip());
        String fechaEnvasado = String.valueOf(comboBoxFechaEnvasado.getTooltip());

        // Guardar los datos en el ArrayList
        listaProductos.add(nombre);
        listaProductos.add(idProducto);
        listaProductos.add(descripcion);
        listaProductos.add(valorUnitario);
        listaProductos.add(cantidadExistencia);
        listaProductos.add(temperaturaRecomendada);
        listaProductos.add(codigoAprobacion);
        listaProductos.add(pesoEnvase);
        listaProductos.add(fechaVencimiento);
        listaProductos.add(fechaEnvasado);

        }
}
