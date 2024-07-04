package org.Clothify.dao;


import org.Clothify.dao.User.impl.UserDaoImpl;
import org.Clothify.dao.employe.impl.EmployeeDaoImpl;
import org.Clothify.dao.supplier.impl.SuppDaoImpl;
import org.Clothify.util.DaoType;

public class DaoFactory {

    private static DaoFactory instance;
    private DaoFactory(){}

    public static DaoFactory getInstance() {
        return instance!=null?instance:(instance=new DaoFactory());
    }
    public <T extends SuperDao>T getDao(DaoType type){
        switch (type){
            case EMPLOYEE:return (T) new  EmployeeDaoImpl();
            case USER:return  (T) new UserDaoImpl();
            case SUPPLIER:return (T)new SuppDaoImpl();

        }
        return null;
    }
}