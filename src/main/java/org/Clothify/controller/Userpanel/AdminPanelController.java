package org.Clothify.controller.Userpanel;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminPanelController {


    public AnchorPane anchorPanel;

    @FXML
    void btnemploye(ActionEvent event) {

        try {
            FXMLLoader load = new FXMLLoader();
            load.setLocation(getClass().getResource("/view/add_Employe.fxml"));
            anchorPanel.getChildren().clear();
            anchorPanel.getChildren().add(load.load());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void btnProduckts(ActionEvent actionEvent) {
    }

    public void btnBackonAction(ActionEvent actionEvent) {
        try {
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            Parent root = null;
            root = FXMLLoader.load(getClass().getResource("/view/loginform.fxml"));
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void btnProduct(ActionEvent actionEvent) {
        try {
            FXMLLoader load = new FXMLLoader();
            load.setLocation(getClass().getResource("/view/addSupplier.fxml"));
            anchorPanel.getChildren().clear();
            anchorPanel.getChildren().add(load.load());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnUSER(ActionEvent actionEvent) {
        try {
            FXMLLoader load = new FXMLLoader();
            load.setLocation(getClass().getResource("/view/add-User.fxml"));
            anchorPanel.getChildren().clear();
            anchorPanel.getChildren().add(load.load());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}