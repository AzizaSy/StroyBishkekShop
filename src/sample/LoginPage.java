package sample;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import java.util.ResourceBundle;

import DTO.EmployeeHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.w3c.dom.Node;

public class LoginPage<N>  {
    protected DBConnector dbConnector = new DBConnector();
    public final String SQLUserSelecting = "SELECT ID,CONCAT(FName,\" \",LName) as Name , Position FROM `users` WHERE Login=\"%s\" and Password_=\"%s\";";
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cancel;

    @FXML
    private Button go;

    @FXML
    private TextField login;

    @FXML
    private Label loginMassage;

    @FXML
    private PasswordField password;

    @FXML
    void Cancelation(ActionEvent event) {

    }

    @FXML
    void gotoUserMenu(ActionEvent event)  throws SQLException, IOException, ClassNotFoundException {
        dbConnector.getConnectionToDB();
        ResultSet DBResponseAboutUser = dbConnector.statement.executeQuery(String.format(SQLUserSelecting,login.getText().trim(),password.getText().trim()));
        if(!DBResponseAboutUser.isBeforeFirst()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("User Log in Error");
            alert.setHeaderText("No such User in DB");
            alert.setContentText("The entered username or password is incorrect! try it again");
            alert.showAndWait();
        }else {
            DBResponseAboutUser.next();
            int userId = DBResponseAboutUser.getInt("ID");
            String fullName = DBResponseAboutUser.getString("Name");
            if(IsAdmin(DBResponseAboutUser.getString("Position"))){
                Admin admin = new Admin(userId,fullName,Position.ADMINISTRATOR);
                EmployeeHandler<Admin> EH = new EmployeeHandler<>(admin);
                goToScene(go,"CashierGetMater");
            }else{
                Cashier cashier = new Cashier(userId,fullName,Position.CASHIER);
                EmployeeHandler<Cashier> EH = new EmployeeHandler<>(cashier);
                goToScene(go,"CashierMenu");
            }
            DBResponseAboutUser.close();
            dbConnector.closeConnections();
        }
    }

    @FXML
    void initialize() throws SQLException, IOException, ClassNotFoundException {

    }
    public boolean IsAdmin(String pos){
        return pos.equals("Администратор");
    }

    static void goToScene(Button button,String fxml) throws IOException {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(LoginPage.class.getResource("/fxml/" + fxml + ".fxml")));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
            button.getScene().getWindow().hide();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
