package org.Clothify.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private String employeeId;
    private String employeeTitle;
    private String employeeName;
    private String employeePosition;
    private Double salary;
    private String address;
    private String city;
    private String province;
    private String postalCode;


}