import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.IOException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ChoicesController
{
    public String inputmethod;

    @FXML Button add;
    @FXML Button update;
    @FXML Button delete;
    @FXML Button find;


    @FXML public void inputAdd(ActionEvent e)throws IOException 
    {
        AddController addController =new AddController();
        FXMLLoader loaderadd = new FXMLLoader(getClass().getResource("addandupdate.fxml"));
        loaderadd.setController(addController);
        Parent root = loaderadd.load();
        Scene home_page_scene = new Scene(root);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }



    @FXML public void inputFind(ActionEvent e)throws IOException 
    {
        FindController findCtrl =new FindController();
        FXMLLoader loaderfind = new FXMLLoader(getClass().getResource("find.fxml"));
        loaderfind.setController(findCtrl);
        Parent root = loaderfind.load();
        Scene home_page_scene = new Scene(root);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }

    @FXML public void inputUpdate(ActionEvent e)throws IOException 
    {
        UpdateController updateCtrl =new UpdateController();
        FXMLLoader loaderupdate = new FXMLLoader(getClass().getResource("update.fxml"));
        loaderupdate.setController(updateCtrl);
        Parent root = loaderupdate.load();
        Scene home_page_scene = new Scene(root);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }

    @FXML public void inputDelete (ActionEvent e)throws IOException 
    {
        DeleteController updateCtrl =new DeleteController();
        FXMLLoader loaderdelete = new FXMLLoader(getClass().getResource("delete.fxml"));
        loaderdelete.setController(updateCtrl);
        Parent root = loaderdelete.load();
        Scene home_page_scene = new Scene(root);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }





}