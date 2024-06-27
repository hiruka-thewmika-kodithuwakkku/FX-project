package org.Clothify.dao.employe.impl;



import org.Clothify.dao.employe.EmployeeDao;
import org.Clothify.entity.CustomerEntity;
import org.Clothify.entity.EmployeEntity;
import org.Clothify.util.HibernateUtil;
import org.hibernate.Session;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public boolean save(EmployeEntity entity) {
        System.out.println(entity);
        System.out.println("in");
        Session session = HibernateUtil.getSession();
        session.getTransaction().begin();
        session.detach(entity);
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

