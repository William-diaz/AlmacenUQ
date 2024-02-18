package Controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AlmacenController {

    private Stage stage;

    @FXML
    private Button botonCliente;

    @FXML
    private Button botonProducto;

    // Este metodo lleva a la ventana de Cliente
    @FXML
    void showProducto(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Producto.fxml"));
        Parent root = loader.load();
        ProductoController controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage ();
        stage.setScene(scene);
        stage.show();
        this.stage.close();

    }

    // Esta metodo lleva a la ventana de Cliente
    @FXML
    void showCliente(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Cliente.fxml"));
        Parent root = loader.load();
        ClienteController controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage ();
        stage.setScene(scene);
        stage.show();
        this.stage.close();
    }

    public void setStage(Stage primaryStage) {
        stage = primaryStage;
    }

}

