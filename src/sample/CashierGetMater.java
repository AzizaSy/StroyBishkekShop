package sample;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import NotControlers.Admin;
import NotControlers.MaterialWorker;
import NotControlers.Position;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CashierGetMater {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<MaterialWorker.Material, String> brand;

    @FXML
    private TableColumn<MaterialWorker.Material, Integer> id;

    @FXML
    private Button menu;

    @FXML
    private TableColumn<MaterialWorker.Material, String> name;

    @FXML
    private TableColumn<MaterialWorker.Material, Integer> preis;

    @FXML
    private TableColumn<MaterialWorker.Material, Integer> quantaty;

    @FXML
    private TableColumn<MaterialWorker.Material, String> suppName;

    @FXML
    private TableColumn<MaterialWorker.Material, String> suppNumber;

    @FXML
    private TableColumn<MaterialWorker.Material, String> suppaddress;

    @FXML
    private TableView<MaterialWorker.Material> table;

    @FXML
    void goToCashierMenu(ActionEvent event) {
        try {
            LoginPage.goToScene(menu,"CashierMenu");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @FXML
    void initialize() throws SQLException, IOException, ClassNotFoundException {
            ObservableList<MaterialWorker.Material> records = FXCollections.observableArrayList(LoginPage.Employee.getLM());
            table.setItems(records);
            id.setCellValueFactory(new PropertyValueFactory<>("id"));
            name.setCellValueFactory(new PropertyValueFactory<>("name"));
            brand.setCellValueFactory(new PropertyValueFactory<>("brand"));
            quantaty.setCellValueFactory(new PropertyValueFactory<>("quantity"));
            preis.setCellValueFactory(new PropertyValueFactory<>("price"));
            suppName.setCellValueFactory(new PropertyValueFactory<>("supliers_name"));
            suppNumber.setCellValueFactory(new PropertyValueFactory<>("supliers_phone"));
            suppaddress.setCellValueFactory(new PropertyValueFactory<>("supliers_adress"));



    }


}
