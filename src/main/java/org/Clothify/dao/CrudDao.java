package org.Clothify.dao;

import java.util.List;

public interface CrudDao <T> extends SuperDao{
    boolean save(T dto);
    boolean delete(String id);
    List get();
}
