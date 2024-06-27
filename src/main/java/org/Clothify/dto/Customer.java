package org.Clothify.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {

    private String customerId;
    private String address;
    private String city;
    private String customerName;
    private String customerTitle;
    private Date dob;
    private String postalCode;
    private String province;
    private Double salary;


}
