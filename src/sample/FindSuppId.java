package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FindSuppId {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> address;

    @FXML
    private Button menu;

    @FXML
    private TableColumn<?, ?> name;

    @FXML
    private TableColumn<?, ?> number;

    @FXML
    private Button search;

    @FXML
    private TableColumn<?, ?> suppId;

    @FXML
    private TableView<?> suppTable;

    @FXML
    private TextField supplierId;

    @FXML
    private TableColumn<?, ?> surname;

    @FXML
    void initialize() {

    }

}
