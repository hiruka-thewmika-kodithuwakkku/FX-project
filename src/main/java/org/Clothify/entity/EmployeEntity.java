package org.Clothify.entity;

import jakarta.persistence.Entity;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class EmployeEntity {
    @Id
    private String id;
    private String employeeTitle;
    private String employeeName;
    private String employeePosition;
    private String salary;
    private String address;
    private String city;
    private String province;
    private String postalCode;

}
