package com.ecommers.web.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;

    @Column(name = "username", nullable=false , length =100)
    private String username ;

    @Column(name="password", nullable=false)
    private String email ;

    @Column(name="password", nullable=false)
    private String password ;
}
