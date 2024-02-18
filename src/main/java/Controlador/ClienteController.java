package Controlador;

import Almacen.Model.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.util.ArrayList;

public class ClienteController {

    @FXML
    private Button botonCrear;

    @FXML
    private Button botonEliminar;

    @FXML
    private RadioButton botonPersonaJuridica;

    @FXML
    private RadioButton botonPersonaNatural;

    @FXML
    private Button botonVolver;

    @FXML
    private TableColumn<?, ?> columnaApellidos;

    @FXML
    private TableColumn<?, ?> columnaCorreo;

    @FXML
    private TableColumn<?, ?> columnaDireccion;

    @FXML
    private TableColumn<?, ?> columnaFechaNacimiento;

    @FXML
    private TableColumn<?, ?> columnaId;

    @FXML
    private TableColumn<?, ?> columnaNit;

    @FXML
    private TableColumn<?, ?> columnaNombre;

    @FXML
    private TableColumn<?, ?> columnaTelefono;

    @FXML
    private DatePicker comboBoxFechaNacimiento;

    @FXML
    private TextField textFieldApellido;

    @FXML
    private TextField textFieldCorreo;

    @FXML
    private TextField textFieldDireccion;

    @FXML
    private TextField textFieldId;

    @FXML
    private TextField textFieldNit;

    @FXML
    private TextField textFieldNombre;

    @FXML
    private TextField textFieldTelefono;

    @FXML
    private ToggleGroup tipoPersona;

    // Evento para volver a la pagina principal
    @FXML
    void showAlmacen(ActionEvent event) {

    }
    // Se crea una lista de Clientes para capturar los datos
    private ArrayList<String> listaClientes = new ArrayList<>();

    // Método para eliminar un cliente por su ID


        // Metodo para capturar/guardar los datos
        @FXML
        private void guardarDatos() {
            String nombre = textFieldNombre.getText();
            String id = textFieldId.getText();
            String apellido = textFieldApellido.getText();
            String direccion = textFieldDireccion.getText();
            String telefono = textFieldTelefono.getText();
            String nit = textFieldNit.getText();
            String correo = textFieldCorreo.getText();

            // Guardar los datos en el ArrayList
            listaClientes.add(nombre);
            listaClientes.add(id);
            listaClientes.add(apellido);
            listaClientes.add(direccion);
            listaClientes.add(telefono);
            listaClientes.add(nit);
            listaClientes.add(correo);

            }

    /*
     Al presionar la casilla de cliente juridico, se activan los atributos de cliente juridico, mientras
     que los de cliente natural se bloquean y viceversa
     */
        public void ocultarTextoJuridico (ActionEvent actionEvent){

            textFieldCorreo.setDisable(true);
            comboBoxFechaNacimiento.setDisable(true);
            textFieldNit.setDisable(false);

            textFieldCorreo.setText("");
            comboBoxFechaNacimiento.getEditor().clear();
        }

        public void ocultarTextoNatural (ActionEvent actionEvent){

            textFieldCorreo.setDisable(false);
            comboBoxFechaNacimiento.setDisable(false);
            textFieldNit.setDisable(true);

            textFieldNit.setText("");

    }
}


