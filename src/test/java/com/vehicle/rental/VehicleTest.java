package com.vehicle.rental;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehicleTest {

    @Test
    void testCarRentalCost() {
        Vehicle car = new Car("1234", "Sedan", 50, true);
        assertEquals(250.0, car.calculateRentalCost(5), 0.01, "Car rental cost for 5 days should be $250");
    }

    @Test
    void testMotorcycleRentalCost() {
        Vehicle motorcycle = new Motorcycle("5678", "Sport", 30, true);
        assertEquals(54.0, motorcycle.calculateRentalCost(2), 0.01, "Motorcycle rental cost for 2 days should be $54");
    }

    @Test
    void testTruckRentalCost() {
        Vehicle truck = new Truck("91011", "Cargo", 100, true);
        assertEquals(750.0, truck.calculateRentalCost(5), 0.01, "Truck rental cost for 5 days should be $750");
    }

    @Test
    void testCarAvailability() {
        Vehicle car = new Car("1234", "Sedan", 50, true);
        assertTrue(car.isAvailableForRental(), "Car should be available for rental");
    }

    @Test
    void testMotorcycleAvailability() {
        Vehicle motorcycle = new Motorcycle("5678", "Sport", 30, false);
        assertFalse(motorcycle.isAvailableForRental(), "Motorcycle should not be available for rental");
    }
}
