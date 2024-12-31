package com.vehicle.rental;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RentalAgencyTest {

    private RentalAgency agency;
    private Customer customer;
    private Vehicle car;
    private Vehicle motorcycle;

    @BeforeEach
    void setUp() {
        agency = new RentalAgency("Super Rentals");
        customer = new Customer("John Doe", "john@example.com");
        car = new Car("1234", "Sedan", 50, true);
        motorcycle = new Motorcycle("5678", "Sport", 30, true);
    }

    @Test
    void testRentVehicle() {
        agency.rentVehicle(customer, car, 5);
        assertEquals(1, customer.getRentalHistory().size(), "Customer should have 1 rental transaction.");
    }

    @Test
    void testRentUnavailableVehicle() {
        motorcycle.setAvailable(false);  // Make motorcycle unavailable
        agency.rentVehicle(customer, motorcycle, 3);
        assertEquals(0, customer.getRentalHistory().size(), "Customer should have 0 rental transactions for unavailable vehicle.");
    }

    @Test
    void testReturnVehicle() {
        agency.rentVehicle(customer, car, 5);
        agency.returnVehicle(customer, car);
        assertTrue(car.isAvailableForRental(), "Car should be available after being returned.");
    }
}
