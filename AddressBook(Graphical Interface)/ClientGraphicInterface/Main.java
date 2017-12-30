import java.io.IOException;
import java.net.URL;
import java.rmi.registry.*;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Controller controller =new Controller();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("intro.fxml"));
        loader.setController(controller);
        Parent root = loader.load();
        primaryStage.setTitle("Hello Employer");
        primaryStage.setScene(new Scene(root, 920, 521));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

}
