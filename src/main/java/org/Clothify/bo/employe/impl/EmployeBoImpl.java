package org.Clothify.bo.employe.impl;
import org.Clothify.bo.employe.EmployeeBo;
import org.Clothify.dao.DaoFactory;
import org.Clothify.dao.employe.EmployeeDao;
import org.Clothify.dto.Employee;
import org.Clothify.entity.EmployeEntity;
import org.Clothify.util.DaoType;
import org.modelmapper.ModelMapper;

public class EmployeBoImpl implements EmployeeBo {

    private EmployeeDao employeeDao = DaoFactory.getInstance().getDao(DaoType.EMPLOOYE);
    @Override
    public boolean saveCustomer(Employee dto) {
        return employeeDao.save(new ModelMapper().map(dto, EmployeEntity.class));
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }
}

