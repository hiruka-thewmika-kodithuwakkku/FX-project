package org.Clothify.bo;




import org.Clothify.bo.User.impl.UserBoImpl;
import org.Clothify.bo.custom.impl.CustomerBoImpl;
import org.Clothify.bo.employe.impl.EmployeBoImpl;
import org.Clothify.util.BoType;


public class BoFactory {
    private static BoFactory instance;
    private BoFactory(){}
    public static BoFactory getInstance(){
        return instance!=null?instance:(instance=new BoFactory());
    }
    public <T extends SuperBo>T getBo(BoType type){
        switch (type){
            case CUSTOMER:return (T) new CustomerBoImpl();
            case EMPLOYEE:return (T) new EmployeBoImpl();
        }
        return null;
    }

}
