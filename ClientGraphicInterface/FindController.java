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
import java.rmi.registry.*;
import java.util.Scanner;


public class FindController{

    @FXML
    private TextField CIN;

    @FXML Button submit;


    @FXML public void findinput(ActionEvent e)throws IOException 
    {
        // Registry reg = LocateRegistry.getRegistry("localhost", 1099);
        // FabTreatmentInterface factory = (FabTreatmentInterface) reg.lookup("Factory");
        // TreatmentInterface TraitmnentObj;
        // TraitmnentObj = (TreatmentInterface) factory.newTreatmentImpl();
        // Employee emp1 =new Employee( FamilyName.getText(),Username.getText(),Integer.parseInt(Password.getText()), Integer.parseInt(telephoneNumber.getText()));
        // TraitmnentObj.findEmployee(Controller.InitutionName,emp1);  
    }


}