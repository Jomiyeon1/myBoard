package com.example.MyBoard.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "USERS")
public class User {

    @Id
    @Column(name="USER_ID")
    private String userId;

    private String password;
    private String name;
}
