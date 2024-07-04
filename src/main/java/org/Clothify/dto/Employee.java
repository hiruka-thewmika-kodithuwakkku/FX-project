package org.Clothify.dto;


import lombok.*;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

    private String Id;
    private String employeeTitle;
    private String employeeName;
    private String salary;
    private String employeePosition;
    private String address;
    private String city;
    private String province;
    private String postalCode;


}