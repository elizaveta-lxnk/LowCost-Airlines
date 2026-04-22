package com.airline;

public class Main {
    public static void main(String[] args) {
        // Створюємо рейс
        Flight flight = new Flight("LO-777", "Варшава", 1200.0);

        // Створюємо пасажира
        Passenger passenger = new Passenger("Тарас", "Шевченко", "КВ123456");

        // Створюємо квиток (Пасажир + Рейс + Багаж + Пріоритет)
        // Наприклад: з багажем (true), але без пріоритетної посадки (false)
        Ticket ticket = new Ticket(passenger, flight, true, false);

        System.out.println("РЕЗУЛЬТАТ БРОНЮВАННЯ");
        System.out.println(ticket.toString());
    }
}