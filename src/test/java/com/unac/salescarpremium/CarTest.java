package com.unac.salescarpremium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.unac.salescarpremium.entities.Car;

public class CarTest {

    private List<Car> carList;

    @BeforeEach
    void setUp() {
        carList = new ArrayList<>();
    }

    @Test
    @DisplayName("Should have an empty car list after setup")
    void shouldHaveEmptyCarListAfterSetup() {
        assertEquals(0, carList.size());
    }

    @Test
    @DisplayName("Should add a car to the list")
    void shouldAddCarToList() {
        Car car = new Car(1L, "Toyota", "Corolla", "Rojo", 2020, "ABC123", java.time.LocalDate.of(2020, 1, 1));
        carList.add(car);
        assertEquals(1, carList.size());
        assertEquals("Toyota", carList.get(0).getMarca());
    }

    @Test
    @DisplayName("Should add multiple cars to the list")
    void shouldAddMultipleCarsToList() {
        Car car1 = new Car(1L, "Toyota", "Corolla", "Rojo", 2020, "ABC123", java.time.LocalDate.of(2020, 1, 1));
        Car car2 = new Car(2L, "Honda", "Civic", "Azul", 2021, "XYZ789", java.time.LocalDate.of(2021, 5, 10));
        carList.add(car1);
        carList.add(car2);
        assertEquals(2, carList.size());
        assertEquals("Honda", carList.get(1).getMarca());
    }

    @Test
    @DisplayName("Should update car color")
    void shouldUpdateCarColor() {
        Car car = new Car(1L, "Mazda", "3", "Negro", 2019, "DEF456", java.time.LocalDate.of(2019, 3, 15));
        carList.add(car);
        car.setColor("Blanco");
        assertEquals("Blanco", carList.get(0).getColor());
    }

    @Test
    @DisplayName("Should remove car from list")
    void shouldRemoveCarFromList() {
        Car car = new Car(1L, "Ford", "Focus", "Gris", 2018, "GHI789", java.time.LocalDate.of(2018, 7, 20));
        carList.add(car);
        carList.remove(car);
        assertTrue(carList.isEmpty());
    }

    @Test
    @DisplayName("Should get car by placa")
    void shouldGetCarByPlaca() {
        Car car = new Car(1L, "Chevrolet", "Sail", "Verde", 2017, "JKL012", java.time.LocalDate.of(2017, 11, 5));
        carList.add(car);
        Car found = carList.stream().filter(c -> "JKL012".equals(c.getPlaca())).findFirst().orElse(null);
        assertNotNull(found);
        assertEquals("Chevrolet", found.getMarca());
    }

    @Test
    @DisplayName("Should set and get car model year")
    void shouldSetAndGetCarModelYear() {
        Car car = new Car();
        car.setModel(2022);
        assertEquals(2022, car.getModel());
    }

    @Test
    @DisplayName("Should set and get car fabrication date")
    void shouldSetAndGetCarFabricationDate() {
        Car car = new Car();
        java.time.LocalDate date = java.time.LocalDate.of(2022, 12, 31);
        car.setFechafabri(date);
        assertEquals(date, car.getFechafabri());
    }
}