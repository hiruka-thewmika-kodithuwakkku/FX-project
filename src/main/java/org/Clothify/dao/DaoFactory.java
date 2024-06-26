package org.Clothify.dao;


import org.Clothify.dao.User.impl.UserDaoImpl;
import org.Clothify.dao.employe.impl.EmployeDaoImpl;
import org.Clothify.util.DaoType;

public class DaoFactory {

    private static DaoFactory instance;
    private DaoFactory(){}

    public static DaoFactory getInstance() {
        return instance!=null?instance:(instance=new DaoFactory());
    }
    public <T extends SuperDao>T getDao(DaoType type){
        switch (type){
            case EMPLOYE :return (T)new EmployeDaoImpl();
            case USER:return  (T)new UserDaoImpl();
        }
        return null;
    }
}
