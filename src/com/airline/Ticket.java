package com.airline;

public class Ticket {
    private Passenger passenger; // Асоціація
    private Flight flight;       // Асоціація
    private boolean hasBaggage;
    private boolean priorityBoarding;
    private double finalPrice;

    public Ticket(Passenger passenger, Flight flight, boolean hasBaggage, boolean priorityBoarding) {
        this.passenger = passenger;
        this.flight = flight;
        this.hasBaggage = hasBaggage;
        this.priorityBoarding = priorityBoarding;
        this.finalPrice = calculateTotal(); // Рахуємо ціну відразу
    }

    // Логіка LowCost: багаж дорожче за квиток, як у завданні
    private double calculateTotal() {
        double total = flight.getBasePrice();
        if (hasBaggage) {
            total += 1500; // Наприклад, багаж коштує 1500
        }
        if (priorityBoarding) {
            total += 400;  // Пріоритет - 400
        }
        return total;
    }

    @Override
    public String toString() {
        return "КВИТОК:\n" +
                "Пасажир: " + passenger + "\n" +
                flight + "\n" +
                "Додатково: Багаж=" + (hasBaggage ? "Так" : "Ні") +
                ", Пріоритет=" + (priorityBoarding ? "Так" : "Ні") + "\n" +
                "ПІДСУМКОВА ВАРТІСТЬ: " + finalPrice + " грн\n";
    }
}