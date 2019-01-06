package com.bapaotime.models;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private int id;

    private String firstName;

    private String lastName;
}
