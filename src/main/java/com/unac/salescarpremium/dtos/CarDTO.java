package com.unac.salescarpremium.dtos;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CarDTO {

    private long id;
    private String marca;
    private String linea;
    private String color;
    private int model;
    private String placa;

}
