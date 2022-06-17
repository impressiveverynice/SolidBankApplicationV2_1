package com.example.solidbank;

import lombok.*;

import javax.persistence.*;

@Table(schema = "USER_ENTITY")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private  Integer id;

    private String login;

    private String password;

    private String role;
    public User (String login, String password) {
        this.login = login;
        this.password = password;
    }
}
