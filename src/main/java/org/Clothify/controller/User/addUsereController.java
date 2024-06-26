package org.Clothify.controller.User;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.Clothify.dto.User;
import org.Clothify.util.CrudUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class addUsereController  implements  UserService{
    private static addUsereController instance;
    private addUsereController (){}

    public static addUsereController getInstance(){
        if (instance==null){
            return instance=new addUsereController();
        }
        return instance;
    }

    @Override
    public User searchCustomer(String userID) {
        System.out.println(userID);
        try {
            ResultSet resultSet  = CrudUtil.execute("SELECT * FROM customer WHERE CustID=?",userID);

            while (resultSet.next()){
                return new User(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5)

                );
            }


        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public ObservableList<User> getAllUser() {
        try {
            ResultSet resultSet =CrudUtil.execute("SELECT * FROM customer");
            ObservableList<User> listTable = FXCollections.observableArrayList();
            while (resultSet.next()) {
                listTable.add(
                        new User(
                                resultSet.getString("userId"),
                                resultSet.getString("name"),
                                resultSet.getString("email"),
                                resultSet.getString("password"),
                                resultSet.getString("otp")

                        )
                );
            }
            return listTable;

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
