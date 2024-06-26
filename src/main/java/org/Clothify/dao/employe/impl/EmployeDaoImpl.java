package org.Clothify.dao.employe.impl;



import org.Clothify.dao.employe.EmployeDao;
import org.Clothify.entity.EmployeEntity;
import org.Clothify.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeDaoImpl implements EmployeDao {

    @Override
    public boolean save(EmployeEntity entity) {

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

    @Override
    public List<EmployeEntity> get() {
        try (Session session = HibernateUtil.getSession()) {
            List<EmployeEntity> items = null;
            session.beginTransaction();
            Query query = session.createQuery("from SupplierEntity", EmployeEntity.class);
            items = query.getResultList();
            return items;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


}
