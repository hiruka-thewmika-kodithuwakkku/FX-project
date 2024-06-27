package org.Clothify.controller.Employee;

import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.Clothify.bo.BoFactory;
import org.Clothify.bo.employe.EmployeeBo;
import org.Clothify.dto.Employee;
import org.Clothify.util.BoType;

import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ResourceBundle;

public class AddEmplyeController implements Initializable {
    public JFXTextField txtCustomerId;
    public ChoiceBox cmbCustomerTitle;
    public JFXTextField txtCustomerName;
    public DatePicker dateDob;
    public JFXTextField txtSalary, txtAddress;

    public JFXTextField txtCity;
    public JFXTextField txtProvince;
    public JFXTextField txtPostalCode;
    public TableView tblCustomer1;
    public TableColumn colCustomerId;
    public TableColumn colCustomerTitle;
    public TableColumn colCustomerName;
    public TableColumn colDob;
    public TableView tblCustomer2;
    public TableColumn colCustomerIdTbl2;
    public TableColumn colSalary;
    public TableColumn colAddress;
    public TableColumn colCity;
    public TableColumn colProvince;
    public TableColumn colPostalCode;
    public TableColumn colPosition;
    public ChoiceBox addPositionTitle;
    public JFXTextField txtCustomerId1;
    public ChoiceBox employeeTitle;

    private EmployeeBo employeBo = BoFactory.getInstance().getBo(BoType.EMPLOYEE);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        loadInitialValues();
        loadPosition();


    }


    private void loadPosition() {
        ObservableList Position= FXCollections.observableArrayList();
        Position.add("Store Manager");
        Position.add("Assistant Manager");
        Position.add("Department Manager");
        Position.add("Shift Supervisor");
        Position.add("Sales Associate");
        Position.add("Cashier");
        Position.add("Customer Service Representative");
        Position.add("Greeter");
        Position.add("Stock Clerk");
        Position.add("Inventory Control Specialist");
        Position.add("Receiver");
        Position.add("Stylist");
        Position.add("Cleaner");
        Position.add("Security Guard");
        Position.add("E-commerce Manager");
        Position.add("IT Support Specialist");
        Position.add("Digital Marketing Coordinator");
        addPositionTitle.setItems(Position);

    }
    private void loadInitialValues() {
        employeeTitle.setValue("Select Title");
        ObservableList list = FXCollections.observableArrayList();
        list.add(new String("MR"));
        list.add(new String("MRS"));
        list.add(new String("MS"));
        employeeTitle.setItems(list);
    }

    public void btnAddCustomerOnAction(ActionEvent actionEvent) {
        Employee employee= new Employee(
               txtCustomerId1.getText(),
               employeeTitle.getValue().toString(),
               txtCustomerName.getText(),
                txtSalary.getText(),
               addPositionTitle.getValue().toString(),
               txtAddress.getText(),
               txtCity.getText(),
               txtProvince.getText(),
               txtPostalCode.getText()

       );

        boolean em = employeBo.saveCustomer(employee);
        System.out.println(em);

        if (em){
        new Alert(Alert.AlertType.ERROR,"Employe Not Added !").show();
        }else{
        new Alert(Alert.AlertType.CONFIRMATION,"Employe Added !").show();
    }

    }

    public void btnSearchOnAction(ActionEvent actionEvent) {
        Employee employee = EmployeController.getInstance().searchEmploye(txtCustomerId.getText());
        System.out.println(employee);
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }





}
