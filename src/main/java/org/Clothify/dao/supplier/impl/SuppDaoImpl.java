package org.Clothify.dao.supplier.impl;

import org.Clothify.bo.supplier.SupBo;
import org.Clothify.dao.supplier.SupDao;
import org.Clothify.dto.Supplier;
import org.Clothify.entity.SupplierEntity;
import org.Clothify.util.HibernateUtil;
import org.hibernate.Session;

public class SuppDaoImpl implements SupDao {


    @Override
    public boolean save(SupplierEntity entity) {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.persist(entity);
        session.getTransaction().commit();
        session.close();
        return true;

    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
