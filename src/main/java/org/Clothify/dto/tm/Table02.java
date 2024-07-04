package org.Clothify.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Table02 {
    private String employeeID;
    private String Address;
    private String city;
    private String province;
    private String postalCode;

}