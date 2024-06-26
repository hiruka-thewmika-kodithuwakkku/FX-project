package org.Clothify.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Supplier")
public class SupplierEntity {
    @Id
    private String Supplierid;

    @Column(name = "name")
    private String name;

    @Column(name = "company")
    private String company;

    @Column(name = "email")
    private String email;

    // Constructors, getters, and setters
}
