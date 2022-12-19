package com.youcode.vc.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.C;

import java.util.List;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Client implements  java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    private String password;
    private String phone;
    @OneToMany(mappedBy = "client")
    private List<Command> command;
}
