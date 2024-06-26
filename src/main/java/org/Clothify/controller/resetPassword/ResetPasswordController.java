package org.Clothify.controller.resetPassword;


import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ResetPasswordController implements Initializable {

    public TextField emailField;
    public TextField otpField;
    public PasswordField newPasswordField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void handleResetPassword(ActionEvent actionEvent) {
    }

    public void btnBack(ActionEvent actionEvent) {
    }
}
