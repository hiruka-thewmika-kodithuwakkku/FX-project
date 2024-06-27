package org.Clothify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class CustomerEntity {
    @Id
    private String id;
    private String customerTitle;
    private String customerName;
    private Date dob;
    private Double salary;
    private String address;
    private String city;
    private String province;
    private String postalCode;

}
