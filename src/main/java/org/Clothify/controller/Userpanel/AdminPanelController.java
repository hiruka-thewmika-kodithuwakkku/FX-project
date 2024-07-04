package org.Clothify.controller.Userpanel;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminPanelController {


    public AnchorPane anchorPanel;

    @FXML
    void btnemploye(ActionEvent event) {

        try {
            FXMLLoader load = new FXMLLoader();
            load.setLocation(getClass().getResource("/view/add_Employe.fxml"));
            Parent loadedRoot = load.load();
            anchorPanel.getChildren().clear();
            StackPane stackPane = new StackPane(loadedRoot);
            stackPane.setAlignment(Pos.CENTER);
            anchorPanel.getChildren().add(stackPane);
            AnchorPane.setTopAnchor(stackPane, 0.0);
            AnchorPane.setBottomAnchor(stackPane, 0.0);
            AnchorPane.setLeftAnchor(stackPane, 0.0);
            AnchorPane.setRightAnchor(stackPane, 0.0);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }

    public void btnProduckts(ActionEvent actionEvent) {
        try {
            FXMLLoader load = new FXMLLoader();
            load.setLocation(getClass().getResource("/view/addProduct.fxml"));
            Parent loadedRoot = load.load();
            anchorPanel.getChildren().clear();
            StackPane stackPane = new StackPane(loadedRoot);
            stackPane.setAlignment(Pos.CENTER);
            anchorPanel.getChildren().add(stackPane);
            AnchorPane.setTopAnchor(stackPane, 0.0);
            AnchorPane.setBottomAnchor(stackPane, 0.0);
            AnchorPane.setLeftAnchor(stackPane, 0.0);
            AnchorPane.setRightAnchor(stackPane, 0.0);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnBackonAction(ActionEvent actionEvent) {
        try {
            FXMLLoader load = new FXMLLoader();
            load.setLocation(getClass().getResource("/view/loginform.fxml"));
            Parent loadedRoot = load.load();
            anchorPanel.getChildren().clear();
            StackPane stackPane = new StackPane(loadedRoot);
            stackPane.setAlignment(Pos.CENTER);
            anchorPanel.getChildren().add(stackPane);
            AnchorPane.setTopAnchor(stackPane, 0.0);
            AnchorPane.setBottomAnchor(stackPane, 0.0);
            AnchorPane.setLeftAnchor(stackPane, 0.0);
            AnchorPane.setRightAnchor(stackPane, 0.0);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void btnSuplier(ActionEvent actionEvent) {
        try {
            FXMLLoader load = new FXMLLoader();
            load.setLocation(getClass().getResource("/view/addSupplier.fxml"));
            Parent loadedRoot = load.load();
            anchorPanel.getChildren().clear();
            StackPane stackPane = new StackPane(loadedRoot);
            stackPane.setAlignment(Pos.CENTER);
            anchorPanel.getChildren().add(stackPane);
            AnchorPane.setTopAnchor(stackPane, 0.0);
            AnchorPane.setBottomAnchor(stackPane, 0.0);
            AnchorPane.setLeftAnchor(stackPane, 0.0);
            AnchorPane.setRightAnchor(stackPane, 0.0);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnUSER(ActionEvent actionEvent) {
        try {
            FXMLLoader load = new FXMLLoader();
            load.setLocation(getClass().getResource("/view/add-User.fxml"));
            Parent loadedRoot = load.load();
            anchorPanel.getChildren().clear();
            StackPane stackPane = new StackPane(loadedRoot);
            stackPane.setAlignment(Pos.CENTER);
            anchorPanel.getChildren().add(stackPane);
            AnchorPane.setTopAnchor(stackPane, 0.0);
            AnchorPane.setBottomAnchor(stackPane, 0.0);
            AnchorPane.setLeftAnchor(stackPane, 0.0);
            AnchorPane.setRightAnchor(stackPane, 0.0);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
     }
    }