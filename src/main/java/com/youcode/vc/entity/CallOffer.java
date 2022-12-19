package com.youcode.vc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CallOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(unique = true,nullable = false)
    private String refferenceOffer;
    @Column(nullable = false)
    private String productName;

    @ManyToOne
    private Stock stock;
    @ManyToOne
    private Vendor vendor;

    @Enumerated(value = EnumType.STRING)
    private Status status;
}
