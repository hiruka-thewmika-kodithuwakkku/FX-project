package org.Clothify.bo.custom;


import org.Clothify.bo.SuperBo;
import org.Clothify.dto.Customer;

public interface CustomerBo extends SuperBo {
    boolean saveCustomer(Customer dto);
    boolean deleteById(String id);
}
