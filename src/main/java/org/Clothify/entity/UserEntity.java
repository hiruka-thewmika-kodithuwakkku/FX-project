package org.Clothify.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class UserEntity {

    @Id
    private String ID;
    private String name;
    private String email;
    private String password;
    private String otp;
    private Timestamp otpExpiry;
}
