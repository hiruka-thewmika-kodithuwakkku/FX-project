package org.Clothify.bo.User;


import org.Clothify.bo.SuperBo;
import org.Clothify.dto.User;

public interface USerBo extends SuperBo {
    boolean saveCustomer(User dto);
    boolean deleteById(String id);
}
