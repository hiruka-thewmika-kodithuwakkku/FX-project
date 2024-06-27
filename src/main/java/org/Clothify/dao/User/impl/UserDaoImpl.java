package org.Clothify.dao.User.impl;


import org.Clothify.dao.User.UserDao;
import org.Clothify.entity.UserEntity;
import org.Clothify.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class UserDaoImpl  implements UserDao {
    @Override
    public boolean save(UserEntity entity) {
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

//    @Override
//    public List <UserEntity> get() {
//        try (Session session = HibernateUtil.getSession()) {
//            List<UserEntity> items;
//            session.beginTransaction();
//            Query query = session.createQuery("from SupplierEntity", UserEntity.class);
//            items = query.getResultList();
//            return items;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
