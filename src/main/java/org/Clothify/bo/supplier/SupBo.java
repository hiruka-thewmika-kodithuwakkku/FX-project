package org.Clothify.bo.supplier;

import org.Clothify.bo.SuperBo;
import org.Clothify.dto.Supplier;

public interface SupBo extends SuperBo {
    boolean saveSupplier(Supplier dto);
    boolean deleteByID(String id);
}
