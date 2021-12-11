package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Menu  {

    @FXML
    private Button go;

    @FXML
    private Button cancel;

    @FXML
    private TextField login;

    @FXML
    private Label loginMassage;

    @FXML
    private PasswordField password;

    @FXML
    void cancelOnAction(ActionEvent event) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
       stage = (Stage)(Node)event.getSource()).getScene()get.Window();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
    }}

//        Stage s = (Stage) go.getScene().getWindow();
//        s.close();
//
//        Stage stage = new Stage();
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/CashierMenu.fxml"));
//        Scene scene = new Scene((Parent) fxmlLoader.load(),640,375);
//        stage.setTitle("StroyShop");
//        stage.setScene(scene);
//        stage.show();
//    }}









//public void goButtonOnAction(ActionEvent event){
//    if(login.getText().isBlank() == false && password.getText().isBlank() == false){
//        valiadatelogin();
//    }else{
//        loginMassage.setText("Please enter your login and password");
//
//    }



//public void loginOnAction(){
//
//
//}
//
//
//public void cancelOnAction(ActionEvent event){
//        Stage stage = (Stage) cancel.getScene().getWindow();
//        stage.close();
//    }
//
//    public void valiadatelogin(){
//
//    }
//}
//
