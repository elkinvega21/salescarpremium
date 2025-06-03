package com.unac.salescarpremium.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unac.salescarpremium.dao.CarDAO;
import com.unac.salescarpremium.dtos.CarDTO;
import com.unac.salescarpremium.entities.Car;
import com.unac.salescarpremium.services.interfaces.CarService;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDAO carDAO;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<CarDTO> findAllService() {
        List<Car> listDb = carDAO.findAll();

        return listDb.stream()
                .map(car -> modelMapper.map(car, CarDTO.class))
                .collect(Collectors.toList());

    }

    @Override
    public Optional<CarDTO> findOneService(Long id) {
        Optional<Car> car = carDAO.findById(id);
        CarDTO carResp =  modelMapper.map(car.get(), CarDTO.class);
        return Optional.of(carResp);
    }

    @Override
    public CarDTO serveService(CarDTO carDTO) {
        Car car = modelMapper.map(carDTO, Car.class);
        return modelMapper.map(carDAO.save(car),CarDTO.class);
    }
}

