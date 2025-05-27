package com.unac.salescarpremium.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cars_premium")
@Entity
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String marca;
    private String linea;
    private String color;

    @Column(length = 4)
    private int model;
    private String placa;
    private LocalDate fechafabri;


}
