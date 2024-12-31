package com.vehicle.rental;

public class RentalAgency {
    private String agencyName;

    public RentalAgency(String agencyName) {
        this.agencyName = agencyName;
    }

    public void rentVehicle(Customer customer, Vehicle vehicle, int days) {
        if (vehicle.isAvailableForRental()) {
            double cost = vehicle.calculateRentalCost(days);
            RentalTransaction transaction = new RentalTransaction(customer, vehicle, days, cost);
            customer.addRentalTransaction(transaction);
            vehicle.setAvailable(false);
            System.out.println("Rented vehicle: " + vehicle.getModel() + " for " + days + " days. Cost: $" + cost);
        } else {
            System.out.println("Vehicle not available for rental");
        }
    }

    public void returnVehicle(Customer customer, Vehicle vehicle) {
        vehicle.setAvailable(true);
        System.out.println("Vehicle " + vehicle.getModel() + " returned.");
    }
}
