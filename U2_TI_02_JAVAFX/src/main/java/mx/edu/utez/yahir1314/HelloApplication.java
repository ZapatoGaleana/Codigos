package mx.edu.utez.yahir1314;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException
    {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label lblNombre = new Label("Nombre");
        TextField tfNombre = new TextField();
        Label lblEdad = new Label("Edad");
        TextField tfEdad = new TextField();
        Label lblopciones = new Label("Opciones");
        ObservableList<String> opciones = FXCollections.observableArrayList("Estudiante","Profesor","Admin");
        ComboBox<String> cmbOpciones = new ComboBox(opciones);
        Button btnAceptar = new Button("Crear");
        Label lblResultado = new Label();

        btnAceptar.setOnAction(e ->
        {
            String nombre = tfNombre.getText();
            String Edad = tfEdad.getText();
            String seleccion = cmbOpciones.getSelectionModel().getSelectedItem();
            if (nombre.isEmpty() || Edad.isEmpty() || seleccion==null)
            {
                System.out.println("Todos los campos son obligatorios");
                lblResultado.setText("Todos los campos son obligatorios");
                tfNombre.setStyle("-fx-control-inner-background: Red;");
                tfEdad.setStyle("-fx-control-inner-background: Red;");
            }
            else
            {

                lblResultado.setText("Nombre:" + nombre + "\nEdad:" + Edad + "\nOpciones:" + seleccion);
                tfNombre.setStyle("-fx-control-inner-background: Green;");
                tfEdad.setStyle("-fx-control-inner-background: Green;");
            }
        });

        GridPane form = new GridPane();
        form.setStyle("-fx-background-color: green;");
        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(10);

        form.add(lblNombre, 0, 0);
        form.add(tfNombre, 1, 0);
        form.add(lblEdad, 0, 1);
        form.add(tfEdad, 1, 1);
        form.add(lblopciones, 0, 2);
        form.add(cmbOpciones, 1, 2);
        form.add(btnAceptar, 0, 3);
        form.add(lblResultado, 1, 4);


        Scene scene = new Scene(form, 320, 240);

        stage.setTitle("Un consejo");
        Image image = new Image(getClass().getResourceAsStream("/Icons/aa.png"));
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
