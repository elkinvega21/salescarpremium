package com.unac.salescarpremium.controllers;

import com.unac.salescarpremium.dtos.CarDTO;
import com.unac.salescarpremium.services.interfaces.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarControllers {

    @Autowired
    private CarService carService;

    @GetMapping("/listar")
    public List<CarDTO> listCars(){
        try {
            return carService.findAllService();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
