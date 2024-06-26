package org.Clothify.controller.User;

import com.jfoenix.controls.JFXTextField;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import org.Clothify.bo.BoFactory;
import org.Clothify.bo.User.USerBo;
import org.Clothify.dto.User;
import org.Clothify.util.BoType;

import java.net.URL;
import java.util.ResourceBundle;

public class addUserFromController implements Initializable {


    @FXML
    private TableColumn<?, ?> colEmail;

    @FXML
    private TableColumn<?, ?> colID;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPasword;

    @FXML
    private TableColumn<?, ?> colotpExpiry;

    @FXML
    private TableColumn<?, ?> colpositcolotpion;

    @FXML
    private ImageView img;

    @FXML
    private TextField textSearch;

    @FXML
    private JFXTextField textmail;

    @FXML
    private JFXTextField txtNaame;

    @FXML
    private JFXTextField txtSupplierID;

    @FXML
    private JFXTextField txtotp;

    @FXML
    private JFXTextField txtpasword;

    private final USerBo uSerBo= BoFactory.getInstance().getBo(BoType.USER);

    @FXML
    void btnAdd(ActionEvent event) {
        User user = new User(
                txtSupplierID.getText(),
                txtNaame.getText(),
                textmail.getText(),
                txtpasword.getText(),
                txtotp.getText()
        );

       System.out.println(user);
        boolean b = uSerBo.saveCustomer(user);
        System.out.println(b);
        if (b) {
            new Alert(Alert.AlertType.ERROR, "Customer Not Added!").show();
        } else {
            new Alert(Alert.AlertType.CONFIRMATION, "Customer Added!").show();
        }
    }

    @FXML
    void btnDelete(ActionEvent event) {
        // Implement delete logic here
    }

    @FXML
    void btnSearch(ActionEvent event) {
        // Implement search logic here
    }

    @FXML
    void btnUpdate(ActionEvent event) {
        // Implement update logic here
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
