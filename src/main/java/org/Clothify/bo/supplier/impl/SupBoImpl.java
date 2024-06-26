package org.Clothify.bo.supplier.impl;

import org.Clothify.bo.supplier.SupBo;
import org.Clothify.dao.DaoFactory;
import org.Clothify.dao.supplier.SupDao;
import org.Clothify.dto.Supplier;
import org.Clothify.entity.SupplierEntity;
import org.Clothify.util.DaoType;
import org.modelmapper.ModelMapper;

public class SupBoImpl implements SupBo {

    private SupDao supDao= DaoFactory.getInstance().getDao(DaoType.SUPPLIER);
    @Override
    public boolean saveSupplier(Supplier dto) {
        return supDao.save(new ModelMapper().map(dto , SupplierEntity.class));
    }

    @Override
    public boolean deleteByID(String id) {
        return false;
    }
}
