package com.youcode.vc.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Boutique {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private  Client client;
    private  Product product;
    private   int quantiteAcheter;
}
