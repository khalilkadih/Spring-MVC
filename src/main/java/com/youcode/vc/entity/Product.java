package com.youcode.vc.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany(mappedBy ="product" ,cascade = CascadeType.ALL)
    private List<CommandItem> commandItem;
    @Column
    private String productName;
    @Column
    private Double productPrice;
    @Column
    private String category;
    @Column
    private String description;
    @Column
    private Integer quantity;
    @ManyToOne
    private Stock stock;


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
