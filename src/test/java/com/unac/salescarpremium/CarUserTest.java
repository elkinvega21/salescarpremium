package com.unac.salescarpremium;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.unac.salescarpremium.entities.Car;
import com.unac.salescarpremium.entities.User;

public class CarUserTest {

    private List<Car> carList;
    private List<User> userList;

    @BeforeEach
    void setUp() {
        carList = new ArrayList<>();
        userList = new ArrayList<>();
    }

    @Nested
    @DisplayName("Car Tests")
    class CarTests {

        @Test
        @DisplayName("Guardar un coche en la lista")
        void shouldSaveCar() {
            Car car = new Car(1L, "Toyota", "Corolla", "Rojo", 2020, "ABC123", java.time.LocalDate.of(2020, 1, 1));
            assertEquals(0, carList.size());
            carList.add(car);
            assertTrue(carList.contains(car));
            assertEquals(1, carList.size());
        }

        @Test
        @DisplayName("eliminar un coche de la lista")
        void shouldDeleteCar() {
            Car car = new Car(2L, "Honda", "Civic", "Azul", 2021, "XYZ789", java.time.LocalDate.of(2021, 5, 10));
            carList.add(car);
            assertEquals(1, carList.size());
            carList.remove(car);
            assertFalse(carList.contains(car));
            assertEquals(0, carList.size());
        }
    }

    @Nested
    @DisplayName("User Tests")
    class UserTests {

        @Test
        @DisplayName("Guardar un usuario en la lista")
        void shouldSaveUser() {
            User user = new User(1L, "Juan", "Perez", "juanperez@email.com");
            assertEquals(0, userList.size());
            userList.add(user);
            assertTrue(userList.contains(user));
            assertEquals(1, userList.size());
        }

        @Test
        @DisplayName("eliminar un usuario de la lista")
        void shouldDeleteUser() {
            User user = new User(2L, "Ana", "Gomez", "anagomez@email.com");
            userList.add(user);
            assertEquals(1, userList.size());
            userList.remove(user);
            assertFalse(userList.contains(user));
            assertEquals(0, userList.size());
        }
    }

    @Test
    @DisplayName("verificar que un coche existe por ID")
    void shouldFindCarById() {
    Car car = new Car(3L, "Mazda", "3", "Negro", 2019, "MZD456", java.time.LocalDate.of(2019, 3, 15));
    carList.add(car);
    boolean exists = carList.stream().anyMatch(c -> c.getId() == 3L);
    assertTrue(exists, "El carro con id 3L debería existir en la lista");
}

    @Test
    @DisplayName("Existe un coche por placa")
    void shouldFindCarByLicensePlate() {
    Car car = new Car(4L, "Chevrolet", "Spark", "Blanco", 2018, "PLT999", java.time.LocalDate.of(2018, 7, 20));
    carList.add(car);
    boolean plateExists = carList.stream().anyMatch(c -> c.getPlaca().equals("PLT999"));
    assertTrue(plateExists, "La placa PLT999 debería existir en la lista");
}
}

