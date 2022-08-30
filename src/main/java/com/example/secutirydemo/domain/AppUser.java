package com.example.secutirydemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    @Id @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    private String name, username, password;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<AppRole> role = new ArrayList<>();
}
