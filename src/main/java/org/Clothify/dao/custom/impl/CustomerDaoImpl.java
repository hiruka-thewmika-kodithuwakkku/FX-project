package org.Clothify.dao.custom.impl;


import org.Clothify.dao.custom.CustomerDao;
import org.Clothify.entity.CustomerEntity;
import org.Clothify.util.HibernateUtil;
import org.hibernate.Session;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public boolean save(CustomerEntity entity) {

        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.persist(entity);
        session.getTransaction().commit();
        session.close();
        return true;

//        try {
//            String SQL = "INSERT INTO customer VALUES (?,?,?,?,?,?,?,?,?)";
//            CrudUtil.execute(
//                    SQL,
//                    entity.getId(),
//                    entity.getCustomerTitle(),
//                    entity.getCustomerName(),
//                    entity.getDob(),
//                    entity.getSalary(),
//                    entity.getAddress(),
//                    entity.getCity(),
//                    entity.getProvince(),
//                    entity.getPostalCode()
//            );
//
//        } catch (SQLException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
