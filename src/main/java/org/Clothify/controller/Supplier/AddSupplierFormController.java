package org.Clothify.controller.Supplier;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import org.Clothify.bo.BoFactory;
import org.Clothify.bo.employe.EmployeeBo;
import org.Clothify.bo.supplier.SupBo;
import org.Clothify.dto.Supplier;
import org.Clothify.util.BoType;

import java.net.URL;
import java.util.ResourceBundle;

public class AddSupplierFormController implements Initializable {
    public JFXTextField txtCompany;

    public ChoiceBox txtProduct;

    public Button btnAdd;
    public TableColumn colID;
    public TableColumn colmobile;
    public TableColumn coladres;
    public TableColumn colnic;
    public TableColumn colEima;
    public TableColumn colProduct;
    public JFXTextField txtMobileNumber;
    public JFXTextField txaddres;
    public JFXTextField txtSupplierID;
    public JFXTextField txtEmail;
    public ImageView img;
    public ChoiceBox BrandNAme;

    private SupBo supBo = BoFactory.getInstance().getBo(BoType.SUPPLIER);
    public void btnUpdate(ActionEvent actionEvent) {
    }

    public void btnAdd(ActionEvent actionEvent) {

        Supplier supplier =new Supplier(
                txtSupplierID.getText(),
                txtCompany.getText(),
                txtMobileNumber.getText(),
                txaddres.getText(),
                txtEmail.getText(),
                BrandNAme.getValue().toString()

        );
        boolean b= supBo.saveSupplier(supplier);
        System.out.println(b);
        if (!b){
            new Alert(Alert.AlertType.ERROR,"Employe Not Added !").show();
        }else{
            new Alert(Alert.AlertType.CONFIRMATION,"Employe Added !").show();
        }
    }

    public void btnDelete(ActionEvent actionEvent) {
    }

    public void txtsearch(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addBrand();
    }

    private void addBrand() {
        ObservableList BrandName= FXCollections.observableArrayList();
        BrandName.add("Store Manager");
        BrandName.add("Assistant Manager");
        BrandName.add("Department Manager");
        BrandName.add("Shift Supervisor");
        BrandName.add("Sales Associate");
        BrandNAme.setItems(BrandName);

    }
}
