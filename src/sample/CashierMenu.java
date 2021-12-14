package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class CashierMenu {

    @FXML
    private Button closeCashier;

    @FXML
    private Button findBrandMater;

    @FXML
    private Button findMaterId;

    @FXML
    private Button findSuppId;

    @FXML
    private Button seeAllMater;

    @FXML
    private Button seeAllSupp;

    @FXML
    private Button sellCashier;

    @FXML
    void goToCashierGetMater(ActionEvent event) throws IOException {
        LoginPage.goToScene(seeAllMater,"CashierGetMater");
    }

}