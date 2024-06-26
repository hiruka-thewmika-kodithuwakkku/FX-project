package org.Clothify.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String userId;
    private String name;
    private String email;
    private String password;
    private String otp;
}
