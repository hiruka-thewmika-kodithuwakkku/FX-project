package org.Clothify.dao.supplier.impl;

import org.Clothify.bo.supplier.SupBo;
import org.Clothify.dto.Supplier;
import org.Clothify.util.HibernateUtil;
import org.hibernate.Session;

public class SuppDaoImpl implements SupBo {
    @Override
    public boolean saveSupplier(Supplier entity) {
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.persist(entity);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean deleteByID(String id) {
        return false;
    }
}
