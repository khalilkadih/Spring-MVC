package com.youcode.vc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column

    private String firstName;
    @Column

    private String lastName;
    @Column

    private String email;
    @Column
    private String phone;
    @Column
    private String password;
    @OneToMany(mappedBy = "vendor")
    private List<CallOffer> callOffers;
}
