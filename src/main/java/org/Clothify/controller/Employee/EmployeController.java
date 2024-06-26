package org.Clothify.controller.Employee;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.Clothify.dto.Employee;
import org.Clothify.entity.EmployeEntity;
import org.Clothify.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class EmployeController implements EmployeService{

    private static EmployeController instance;

    private EmployeController() {}

    public static EmployeController getInstance() {
        if (instance == null) {
            instance = new EmployeController();
        }
        return instance;
    }
    @Override
    public EmployeEntity searchEmploye(String employeeId) {
        try (Session session = HibernateUtil.getSession()) {
            return session.get(EmployeEntity.class, employeeId);
        } catch (Exception e) {
            throw new RuntimeException("Error searching employee with ID: " + employeeId, e);
        }
    }
    @Override
    public ObservableList getAllEmploye() {
        try (Session session = HibernateUtil.getSession()) {
            Query<EmployeEntity> query = session.createQuery("FROM EmployeEntity", EmployeEntity.class);
            List<EmployeEntity> resultList = query.list();
            return FXCollections.observableArrayList(resultList);
        } catch (Exception e) {
            throw new RuntimeException("Error retrieving all employees", e);
        }
    }

    @Override
    public boolean addEmploye(Employee customer) {
        return false;
    }


}
