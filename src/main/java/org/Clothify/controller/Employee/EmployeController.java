package org.Clothify.controller.Employee;



import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.Clothify.dto.Employee;
import org.Clothify.util.CrudUtil;


import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeController implements EmployeService{

    private static EmployeController instance;

    private EmployeController() {}

    public static EmployeController getInstance() {
        if (instance == null) {
            instance = new EmployeController();
        }
        return instance;
    }

    public Employee searchEmploye(String employeeId) {
        System.out.println(employeeId);
        try {
            ResultSet resultSet  = CrudUtil.execute("SELECT * FROM  employeentity  WHERE  ID=?",employeeId);

            while (resultSet.next()){
                return new Employee(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getString(9)
                );
            }


        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    @Override
    public ObservableList<Employee> getAllEmploye() {
        try {
            ResultSet resultSet = CrudUtil.execute("SELECT * FROM employeentity ");
            ObservableList<Employee> listTable = FXCollections.observableArrayList();
            while (resultSet.next()) {
                listTable.add(
                        new Employee(
                                resultSet.getString(1),
                                resultSet.getString(2),
                                resultSet.getString(3),
                                resultSet.getString(4),
                                resultSet.getString(5),
                                resultSet.getString(6),
                                resultSet.getString(7),
                                resultSet.getString(8),
                                resultSet.getString(9)
                        )
                );

            }
            return listTable;

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }




    public boolean addEmploye(Employee employee) {
        try {
            String SQL = "INSERT INTO  employeentity  VALUES (?,?,?,?,?,?,?,?,?)";
            CrudUtil.execute(
                    SQL,
                    employee.getId(),
                    employee.getCity(),
                    employee.getEmployeeName(),
                    employee.getEmployeePosition(),
                    employee.getEmployeeTitle(),
                    employee.getPostalCode(),
                    employee.getProvince(),
                    employee.getSalary()
            );

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    public boolean deleteEmploye(String employeeId) {
        try {
            String SQL = "DELETE FROM employeentity WHERE ID=?";
            return CrudUtil.execute(SQL, employeeId);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean updateEmploye(Employee employee) {
        try {
            String SQL = "UPDATE employeentity SET (?,?,?,?,?,?,?,?,?)";
            CrudUtil.execute(
                    SQL,
                    employee.getId(),
                    employee.getCity(),
                    employee.getEmployeeName(),
                    employee.getEmployeePosition(),
                    employee.getEmployeeTitle(),
                    employee.getPostalCode(),
                    employee.getProvince(),
                    employee.getSalary()
            );
            return true;
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


