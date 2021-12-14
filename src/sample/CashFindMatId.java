package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CashFindMatId {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> brand;


    @FXML
    private Button menu;


    @FXML
    private TableColumn<?, ?> name;

    @FXML
    private TableColumn<?, ?> preis;


    @FXML
    private TableColumn<?, ?> quantaty;

    @FXML
    private Button search;

    @FXML
    private TableColumn<?, ?> suppAddress;

    @FXML
    private TableColumn<?, ?> suppName;

    @FXML
    private TableColumn<?, ?> suppNumber;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> tableId;

    @FXML
    private TextField textFieldId;

    @FXML
    void initialize() {

    }


}
