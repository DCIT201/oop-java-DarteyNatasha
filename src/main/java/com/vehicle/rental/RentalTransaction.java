package com.vehicle.rental;

public class RentalTransaction {
    private Customer customer;
    private Vehicle vehicle;
    private int daysRented;
    private double totalCost;

    public RentalTransaction(Customer customer, Vehicle vehicle, int daysRented, double totalCost) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.daysRented = daysRented;
        this.totalCost = totalCost;
    }

    // Getters and setters

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public void setDaysRented(int daysRented) {
        this.daysRented = daysRented;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
