package com.vehicle.rental;

public class Truck extends Vehicle {
    public Truck(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate() * 1.5; // Trucks cost more to rent
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
