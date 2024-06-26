package org.Clothify.controller.Supplier;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import org.Clothify.dto.Supplier;

public class AddSupplierFormController {
    public JFXTextField txtCompany;
    public JFXTextField mobilenukmber;
    public ChoiceBox txtProduct;
    public JFXTextField addres;

    public void btnUpdate(ActionEvent actionEvent) {
    }

    public void btnAdd(ActionEvent actionEvent) {

        Supplier supplier =new Supplier(

        );
    }

    public void btnDelete(ActionEvent actionEvent) {
    }
}
