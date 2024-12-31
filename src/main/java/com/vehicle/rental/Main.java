package com.vehicle.rental;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create RentalAgency and Customer
        RentalAgency agency = new RentalAgency("Super Rentals");
        Customer customer = new Customer("John Doe", "john@example.com");

        // Create vehicles
        Vehicle car = new Car("1234", "Sedan", 50, true);
        Vehicle motorcycle = new Motorcycle("5678", "Sport", 30, true);
        Vehicle truck = new Truck("91011", "Cargo", 100, true);

        // Rent vehicles
        agency.rentVehicle(customer, car, 5);
        agency.rentVehicle(customer, motorcycle, 2);

        // Return vehicles
        agency.returnVehicle(customer, car);
        agency.returnVehicle(customer, motorcycle);
    }
}
