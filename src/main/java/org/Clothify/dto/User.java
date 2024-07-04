package org.Clothify.dto;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String ID;
    private String name;
    private String email;
    private String password;
    private String otp;
}
