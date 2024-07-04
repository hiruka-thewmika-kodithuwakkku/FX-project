package org.Clothify.controller.Supplier;

import javafx.collections.ObservableList;
import org.Clothify.dto.Employee;
import org.Clothify.dto.Supplier;

public interface SupplierServce {
    Supplier searchSupplier(String Id);
    ObservableList<Supplier> getAllSupplier();
    boolean addSupplier(Supplier employee);
}
