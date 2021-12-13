package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class CashierGetMater {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> brand;

    @FXML
    private TableColumn<?, ?> id;

    @FXML
    private Button menu;

    @FXML
    private TableColumn<?, ?> name;

    @FXML
    private TableColumn<?, ?> preis;

    @FXML
    private TableColumn<?, ?> quantaty;

    @FXML
    private TableColumn<?, ?> suppName;

    @FXML
    private TableColumn<?, ?> suppNumber;

    @FXML
    private TableColumn<?, ?> suppaddress;

    @FXML
    private TableView<?> table;

    @FXML
    void initialize() {

    }

}
