package com.unac.salescarpremium.services.interfaces;

import com.unac.salescarpremium.dtos.CarDTO;

import java.util.List;
import java.util.Optional;

public interface CarService {
    List<CarDTO> findAllService();
    Optional<CarDTO> findOneService(Long id);
    CarDTO serveService(CarDTO carDTO);

}
