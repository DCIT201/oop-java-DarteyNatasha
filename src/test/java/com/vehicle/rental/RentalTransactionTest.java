package com.vehicle.rental;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RentalTransactionTest {

    @Test
    void testRentalTransactionCreation() {
        Customer customer = new Customer("John Doe", "john@example.com");
        Vehicle car = new Car("1234", "Sedan", 50, true);
        RentalTransaction transaction = new RentalTransaction(customer, car, 5, 250);

        assertNotNull(transaction, "Rental transaction should be created successfully.");
        assertEquals(250, transaction.getTotalCost(), "Total rental cost should be $250.");
        assertEquals(customer, transaction.getCustomer(), "Customer should be correct.");
        assertEquals(car, transaction.getVehicle(), "Vehicle should be correct.");
    }
}
