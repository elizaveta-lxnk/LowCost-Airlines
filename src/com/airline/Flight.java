package com.airline;

public class Flight {
    private String flightNumber;
    private String destination;
    private double basePrice;

    public Flight(String flightNumber, String destination, double basePrice) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.basePrice = basePrice;
    }

    public String getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public double getBasePrice() { return basePrice; }

    @Override
    public String toString() {
        return "Рейс " + flightNumber + " до міста " + destination + " [Базова ціна: " + basePrice + "]";
    }
}