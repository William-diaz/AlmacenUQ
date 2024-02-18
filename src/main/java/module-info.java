module Almacen{
    requires javafx.controls;
    requires javafx.fxml;
    exports Almacen.Model;
    exports Almacen.Aplication;
    opens Almacen to javafx.fxml;
    opens Almacen.Model to javafx.fxml;
    opens Controlador to javafx.fxml;
    exports Controlador;
}