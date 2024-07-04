package org.Clothify.bo.employe;


import javafx.collections.ObservableList;
import org.Clothify.bo.SuperBo;
import org.Clothify.dto.Employee;

public interface EmployeeBo extends SuperBo {
    boolean saveEmployee(Employee dto);
    boolean deleteById(String id);

}
