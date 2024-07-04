package org.Clothify.controller.Employee;

import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.Clothify.bo.BoFactory;
import org.Clothify.bo.employe.EmployeeBo;
import org.Clothify.dto.Employee;
import org.Clothify.dto.tm.Table01;
import org.Clothify.dto.tm.Table02;
import org.Clothify.util.BoType;

import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ResourceBundle;

public class AddEmplyeController implements Initializable {
    public JFXTextField txtCustomerId;
    public JFXTextField txtCustomerName;
    public JFXTextField txtSalary, txtAddress;

    public JFXTextField txtCity;
    public JFXTextField txtProvince;
    public JFXTextField txtPostalCode;
    public TableView tblEmployee1;
    public TableColumn colEmployeID;
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
    public TableColumn colEmployeTitle;
    public TableColumn colEmployerName;

    private EmployeeBo employeBo = BoFactory.getInstance().getBo(BoType.EMPLOYEE);

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        colEmployeID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        colEmployeTitle.setCellValueFactory(new PropertyValueFactory<>("Title"));
        colEmployerName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("Salary"));

        colCustomerIdTbl2.setCellValueFactory(new PropertyValueFactory<>("employeeID"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("Address"));
        colCity.setCellValueFactory(new PropertyValueFactory<>("city"));
        colProvince.setCellValueFactory(new PropertyValueFactory<>("province"));
        colPostalCode.setCellValueFactory(new PropertyValueFactory<>("postalCode"));



        loadInitialValues();
        loadPosition();
        lodeTable1();
        loadTable02();
        cleartextfeeld();

    }



    private void lodeTable1() {
        ObservableList<Table01> tbl01 = FXCollections.observableArrayList();
        ObservableList<Employee> allEmploye= EmployeController.getInstance().getAllEmploye();

        allEmploye.forEach(employee -> {
            tbl01.add(
                    new Table01(
                            employee.getId(),
                            employee.getEmployeeTitle(),
                            employee.getEmployeeName(),
                            employee.getSalary()

                    )
            );
        });
        tblEmployee1.setItems(tbl01);
    }
    private void loadTable02() {
        ObservableList<Table02> tbl02 = FXCollections.observableArrayList();

        ObservableList<Employee> allCustomers = EmployeController.getInstance().getAllEmploye();
        allCustomers.forEach(employee -> {
            tbl02.add(
                    new Table02(
                            employee.getId(),
                            employee.getAddress(),
                            employee.getCity(),
                            employee.getProvince(),
                            employee.getPostalCode()
                    )
            );
        });
        tblCustomer2.setItems(tbl02);
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

        boolean b= employeBo.saveEmployee(employee);
        System.out.println(b);
        if (!b){
        new Alert(Alert.AlertType.ERROR,"Employe Not Added !").show();
        }else{
        new Alert(Alert.AlertType.CONFIRMATION,"Employe Added !").show();
    }
        lodeTable1();
        loadTable02();
        cleartextfeeld();

    }

    public void btnSearchOnAction(ActionEvent actionEvent) {
        Employee employee = EmployeController.getInstance().searchEmploye(txtCustomerId.getText());
        System.out.println(employee);
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
    }
    private void cleartextfeeld() {
                txtCustomerId1.clear();
                txtCustomerName.clear();
                txtSalary.clear();
                txtAddress.clear();
                txtCity.clear();
                txtProvince.clear();
                txtPostalCode.clear();
    }




}
