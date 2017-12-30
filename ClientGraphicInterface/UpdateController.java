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


public class UpdateController
{


    @FXML
    private TextField FamilyName;

    @FXML
    private TextField Username;
 
    @FXML
    private TextField CIN;

    @FXML
    private TextField telephoneNumber;

    @FXML Button submit;


    @FXML public void inputUpdate(ActionEvent e)throws IOException 
     {
        try{
        Registry reg = LocateRegistry.getRegistry("localhost", 1099);
        FabTreatmentInterface factory = (FabTreatmentInterface) reg.lookup("Factory");
        TreatmentInterface TraitmnentObj;
        TraitmnentObj = (TreatmentInterface) factory.newTreatmentImpl();
        Employee emp1 =new Employee( FamilyName.getText(),Username.getText(),Integer.parseInt(CIN.getText()), Integer.parseInt(telephoneNumber.getText()));
        TraitmnentObj.updateEmployee(Controller.InitutionName,emp1);
        }
        catch(Exception exception)
        {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!Access ERORR !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println(exception.toString());
        }
    }

   


}