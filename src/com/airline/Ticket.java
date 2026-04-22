package com.airline;

public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private boolean hasBaggage;
    private boolean priorityBoarding;
    private int daysBeforeFlight; // Додаємо нове поле: дні до вильоту
    private double finalPrice;

    // Оновлений конструктор
    public Ticket(Passenger passenger, Flight flight, boolean hasBaggage, boolean priorityBoarding, int daysBeforeFlight) {
        this.passenger = passenger;
        this.flight = flight;
        this.hasBaggage = hasBaggage;
        this.priorityBoarding = priorityBoarding;
        this.daysBeforeFlight = daysBeforeFlight;
        this.finalPrice = calculateTotal();
    }

    private double calculateTotal() {
        double total = flight.getBasePrice();

        // Логіка підвищення ціни: якщо до рейсу менше 7 днів — ціна зростає на 50%
        if (daysBeforeFlight < 7) {
            total = total * 1.5;
        }

        if (hasBaggage) {
            total += 1500;
        }
        if (priorityBoarding) {
            total += 400;
        }
        return total;
    }

    @Override
    public String toString() {
        return "КВИТОК (замовлено за " + daysBeforeFlight + " днів):\n" +
                "Пасажир: " + passenger + "\n" +
                flight + "\n" +
                "Додатково: Багаж =" + (hasBaggage ? " Так (1500)" : " Ні") +
                ", Пріоритет =" + (priorityBoarding ? " Так (400)" : " Ні") + "\n" +
                "ПІДСУМКОВА ВАРТІСТЬ: " + finalPrice + " грн\n";
    }
}