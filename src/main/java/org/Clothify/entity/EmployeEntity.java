package org.Clothify.entity;

import lombok.*;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class EmployeEntity {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "Employee_id", unique = true, nullable = false)
    private String employeeId;

    @Column(name = "Employee_title")
    private String employeeTitle;

    @Column(name = "Employee_name", nullable = false)
    private String employeeName;


    @Column(name = "Employee_position")
    private String employeePosition;

    @Column(name = "salary")
    private Double salary;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "province")
    private String province;

    @Column(name = "postal_code")
    private String postalCode;

}
