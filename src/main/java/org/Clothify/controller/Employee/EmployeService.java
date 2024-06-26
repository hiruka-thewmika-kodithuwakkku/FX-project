package org.Clothify.controller.Employee;


import javafx.collections.ObservableList;
import org.Clothify.dto.Employee;


public interface EmployeService {
    Employee searchEmploye(String customerId);
    ObservableList<Employee> getAllEmploye();
    boolean addEmploye(Employee customer);
}
