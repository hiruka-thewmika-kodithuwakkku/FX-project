package org.Clothify.bo.custom.impl;


import org.Clothify.bo.custom.CustomerBo;
import org.Clothify.dao.DaoFactory;
import org.Clothify.dao.custom.CustomerDao;
import org.Clothify.dto.Customer;
import org.Clothify.entity.CustomerEntity;
import org.Clothify.util.DaoType;
import org.modelmapper.ModelMapper;

public class CustomerBoImpl implements CustomerBo {

    private CustomerDao customerDao = DaoFactory.getInstance().getDao(DaoType.CUSTOMER);
    @Override
    public boolean saveCustomer(Customer dto) {
        return customerDao.save(new ModelMapper().map(dto, CustomerEntity.class));
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }
}
