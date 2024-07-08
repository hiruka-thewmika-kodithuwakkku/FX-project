package org.Clothify.controller.Employee;


import javafx.collections.ObservableList;
import org.Clothify.dto.Employee;


public interface EmployeService {
    Employee searchEmploye(String Id);
    ObservableList<Employee> getAllEmploye();
    boolean deleteEmploye(String employeeId);
    boolean updateEmploye(Employee employee);
}
