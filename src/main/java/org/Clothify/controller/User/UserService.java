package org.Clothify.controller.User;

import javafx.collections.ObservableList;
import org.Clothify.dto.User;

public interface UserService {
    User searchCustomer(String userID);
    ObservableList<User> getAllUser();


}
