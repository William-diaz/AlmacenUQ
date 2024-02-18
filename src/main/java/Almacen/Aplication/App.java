package Almacen.Aplication;

import Controlador.AlmacenController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

// No fue posible ejecutar esta app que inicia tod, por problemas con el módulo y las rutas :´{

public class App extends Application {
    @Override
    public void start (Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Almacen.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        AlmacenController controller = loader.getController();
        controller.setStage(primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
