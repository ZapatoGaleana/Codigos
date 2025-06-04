package mx.edu.utez.yahir1314;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException
    {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label myLabel = new Label("Buenas. Este es un mensaje diciendo buenas xd");
        StackPane root = new StackPane(myLabel);
        Scene scene = new Scene(root, 320, 240);

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