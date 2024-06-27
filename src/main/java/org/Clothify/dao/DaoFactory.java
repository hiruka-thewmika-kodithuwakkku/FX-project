package org.Clothify.dao;


import org.Clothify.dao.custom.impl.CustomerDaoImpl;
import org.Clothify.dao.employe.impl.EmployeeDaoImpl;
import org.Clothify.util.DaoType;

public class DaoFactory {

    private static DaoFactory instance;
    private DaoFactory(){}

    public static DaoFactory getInstance() {
        return instance!=null?instance:(instance=new DaoFactory());
    }
    public <T extends SuperDao>T getDao(DaoType type){
        switch (type){
            case EMPLOOYE:return (T) new  EmployeeDaoImpl();
            case CUSTOMER:return (T)new CustomerDaoImpl();
        }
        return null;
    }
}