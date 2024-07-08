package org.Clothify.controller.Login;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController  implements Initializable {

    public Button btnLogin;
    public Button btnForgotPassword;
    public JFXTextField txtEmail;
    public JFXTextField txtPassword;
    @FXML
    void checBox(ActionEvent event) {
    }

    @FXML
    void handleForgotPassword(ActionEvent event) {
    }

    @FXML
    void handleLogin(ActionEvent event) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
}
