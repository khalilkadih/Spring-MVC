package com.youcode.vc.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Command implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank(message = "reference must not be blank")
    @Column
    private String reference;

    @Temporal(TemporalType.TIMESTAMP)
    private Date commandDate = new Date(System.currentTimeMillis() );

    @NotNull
    private Double commandTotalPrice;

    @OneToMany(mappedBy = "command")
    private List<CommandItem> commandItem;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


}
