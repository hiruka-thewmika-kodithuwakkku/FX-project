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
@Table(name = "User")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name= "ID")
    private String ID;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "Password")
    private String password;

    @Column(name ="otp")
    private String otp;

    @Column(name = "otp_expiry")
    private Timestamp otpExpiry;
}
