package org.Clothify.controller.customer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.Clothify.dto.Customer;
import org.Clothify.util.CrudUtil;


import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerController implements CustomerService{

    private static CustomerController instance;
    private CustomerController (){}

    public static CustomerController getInstance(){
        if (instance==null){
           return instance=new CustomerController();
        }
        return instance;
    }

    public Customer searchCustomer(String customerId){
        System.out.println(customerId);
        try {
            ResultSet resultSet  = CrudUtil.execute("SELECT * FROM  customerentity  WHERE id =?",customerId);

                while (resultSet.next()){
                    return new Customer(
                            resultSet.getString(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getString(4),
                            resultSet.getString(5),
                            resultSet.getDate(6),
                            resultSet.getString(7),
                            resultSet.getString(8),
                            resultSet.getDouble(9)
                    );
                }


        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public ObservableList<Customer> getAllCustomers() {
        try {
            ResultSet resultSet =CrudUtil.execute("SELECT * FROM  customerentity ");
            ObservableList<Customer> listTable = FXCollections.observableArrayList();
            while (resultSet.next()) {
                listTable.add(
                        new Customer(
                                resultSet.getString("id "),
                                resultSet.getString("address"),
                                resultSet.getString("city"),
                                resultSet.getString("customerName"),
                                resultSet.getString(" customerTitle"),
                                resultSet.getDate("dob"),
                                resultSet.getString("postalCode"),
                                resultSet.getString("province"),
                                resultSet.getDouble("salary")
                        )
                );

            }
            return listTable;

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean addCustomer(Customer customer){
        try {
            String SQL = "INSERT INTO  customerentity  VALUES (?,?,?,?,?,?,?,?,?)";
            CrudUtil.execute(
                    SQL,
                    customer.getCustomerId(),
                    customer.getCustomerTitle(),
                    customer.getCustomerName(),
                    customer.getDob(),
                    customer.getSalary(),
                    customer.getAddress(),
                    customer.getCity(),
                    customer.getProvince(),
                    customer.getPostalCode()
                    );

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
