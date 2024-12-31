package com.vehicle.rental;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {

    private Customer customer;
    private Vehicle car;
    private Vehicle motorcycle;

    @BeforeEach
    void setUp() {
        customer = new Customer("John Doe", "john@example.com");
        car = new Car("1234", "Sedan", 50, true);
        motorcycle = new Motorcycle("5678", "Sport", 30, true);
    }

    @Test
    void testAddRentalTransaction() {
        RentalTransaction transaction = new RentalTransaction(customer, car, 5, 250);
        customer.addRentalTransaction(transaction);
        assertEquals(1, customer.getRentalHistory().size(), "Customer should have 1 rental transaction.");
    }

    @Test
    void testRentalHistory() {
        RentalTransaction transaction1 = new RentalTransaction(customer, car, 5, 250);
        RentalTransaction transaction2 = new RentalTransaction(customer, motorcycle, 3, 90);
        customer.addRentalTransaction(transaction1);
        customer.addRentalTransaction(transaction2);
        assertEquals(2, customer.getRentalHistory().size(), "Customer should have 2 rental transactions.");
    }
}
