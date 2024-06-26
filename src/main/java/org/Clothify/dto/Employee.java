package org.Clothify.dto;


import lombok.*;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    private String employeeId;
    private String employeeTitle;
    private String employeeName;
    private String employeePosition;
    private String salary;
    private String address;
    private String city;
    private String province;
    private String postalCode;


}