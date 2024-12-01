package com.javaintellij.sdia_tp5_v2.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;

public class MainController {
    @FXML
    private TabPane mainTabPane;

    @FXML
    private void showProfesseurs() {
        mainTabPane.getSelectionModel().select(0);
    }

    @FXML
    private void showDepartements() {
        mainTabPane.getSelectionModel().select(1);
    }
}