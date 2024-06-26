package org.Clothify.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Supplier {
    private String Supplierid;
    private String Suppliername;
    private String Suppliercompany;
    private String Supplieremail;
}
