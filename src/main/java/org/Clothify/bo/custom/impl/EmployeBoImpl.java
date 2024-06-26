package org.Clothify.bo.custom.impl;
import org.Clothify.bo.custom.EmployeBo;
import org.Clothify.dao.DaoFactory;
import org.Clothify.dao.employe.EmployeDao;
import org.Clothify.dto.Employee;
import org.Clothify.entity.EmployeEntity;
import org.Clothify.util.DaoType;
import org.modelmapper.ModelMapper;

public class EmployeBoImpl implements EmployeBo {

    private EmployeDao customerDao = DaoFactory.getInstance().getDao(DaoType.EMPLOYE);
    @Override
    public boolean saveCustomer(Employee dto) {
        return customerDao.save(new ModelMapper().map(dto, EmployeEntity.class));
    }

    @Override
    public boolean deleteById(String id) {return false;
    }
}

