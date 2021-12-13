package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SeeAllSupplier {

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
    private TableColumn<?, ?> suppId;

    @FXML
    private TableView<?> suppTable;

    @FXML
    private TableColumn<?, ?> surname;

    @FXML
    void initialize() {

    }

}

