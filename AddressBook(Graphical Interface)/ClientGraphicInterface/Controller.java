import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.IOException;
import javafx.event.*;

public class Controller {

        static String InitutionName;

        @FXML Button Ensi;
        @FXML Button Ensit;
        @FXML Button ISI;
        @FXML Button FST;

        @FXML public void inputFST(ActionEvent e)throws IOException 
        {
            InitutionName="FST";
            ChoicesController choicesController =new ChoicesController();
            FXMLLoader loaderchoices = new FXMLLoader(getClass().getResource("choices.fxml"));
            loaderchoices.setController(choicesController);
            Parent root = loaderchoices.load();
            Scene home_page_scene = new Scene(root);
            Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            app_stage.setScene(home_page_scene);
            app_stage.show();
        }

        @FXML public void inputEnsi(ActionEvent e)throws IOException 
        {
            InitutionName="Ensi";
            ChoicesController choicesController =new ChoicesController();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("choices.fxml"));
            loader.setController(choicesController);
            Parent root = loader.load();
            Scene home_page_scene = new Scene(root);
            Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            app_stage.setScene(home_page_scene);
            app_stage.show();
        }

        @FXML public void inputEnsit(ActionEvent e)throws IOException 
        {
            InitutionName="Ensit";
            ChoicesController choicesController =new ChoicesController();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("choices.fxml"));
            loader.setController(choicesController);
            Parent root = loader.load();
            Scene home_page_scene = new Scene(root);
            Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            app_stage.setScene(home_page_scene);
            app_stage.show();
        }

        @FXML public void inputISI(ActionEvent e)throws IOException 
        {
            InitutionName="ISI";
            ChoicesController choicesController =new ChoicesController();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("choices.fxml"));
            loader.setController(choicesController);
            Parent root = loader.load();
            Scene home_page_scene = new Scene(root);
            Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
            app_stage.setScene(home_page_scene);
            app_stage.show();
        }

}
