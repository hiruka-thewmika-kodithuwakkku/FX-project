package org.Clothify.controller.Employee;


import javafx.collections.ObservableList;
import org.Clothify.dto.Employee;
import org.Clothify.entity.EmployeEntity;

public interface EmployeService {
    EmployeEntity searchEmploye(String customerId);
    ObservableList<EmployeEntity> getAllEmploye();
    boolean addEmploye(Employee customer);
}
