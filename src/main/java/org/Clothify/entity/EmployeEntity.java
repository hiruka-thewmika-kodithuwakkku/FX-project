package org.Clothify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private String ID;
    private String employeeTitle;
    private String employeeName;
    private String salary;
    private String employeePosition;
    private String address;
    private String city;
    private String province;
    private String postalCode;

}
