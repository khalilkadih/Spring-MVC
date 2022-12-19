package com.youcode.vc.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties("products")
public class CommandItem implements  java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String referenceOfItem;
    private Integer itemQuantity;
    private Double itemUnitPrice;
    @ManyToOne(cascade =CascadeType.ALL)
    private  Product product;
    @ManyToOne(cascade =CascadeType.ALL)
    private Command command;
}
