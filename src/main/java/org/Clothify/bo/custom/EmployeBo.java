package org.Clothify.bo.custom;


import org.Clothify.bo.SuperBo;
import org.Clothify.dto.Employee;

public interface EmployeBo extends SuperBo {
    boolean saveCustomer(Employee dto);
    boolean deleteById(String id);
}
