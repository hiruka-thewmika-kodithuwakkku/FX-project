package org.Clothify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SupplierEntity {
    @Id
    private String Supplierid;
    private String company;
    private String Suppliernumber;
    private String supplierAddres;
    private String SupplierEmail;
    private String Brand;


}
