package org.Clothify.bo.employe;


import org.Clothify.bo.SuperBo;
import org.Clothify.dto.Employee;

public interface EmployeeBo extends SuperBo {
    boolean saveCustomer(Employee dto);
    boolean deleteById(String id);
}
