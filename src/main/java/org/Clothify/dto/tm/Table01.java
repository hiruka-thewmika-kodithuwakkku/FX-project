package org.Clothify.dto.tm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Table01 {
    private String customerId;
    private String customerTitle;
    private String customerName;
    private String employeePosition; // Changed to match entity field name
}
