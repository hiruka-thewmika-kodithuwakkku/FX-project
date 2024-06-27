package org.Clothify.controller.customer;


import javafx.collections.ObservableList;
import org.Clothify.dto.Customer;

public interface CustomerService {
    Customer searchCustomer(String customerId);
    ObservableList<Customer> getAllCustomers();
    boolean addCustomer(Customer customer);
}
