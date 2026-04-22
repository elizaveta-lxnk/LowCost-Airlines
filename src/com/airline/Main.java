package com.airline;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight("LO-777", "Варшава", 1200.0);
        Passenger p1 = new Passenger("Тарас", "Тополя", "КВ123456");
        Passenger p2 = new Passenger("Марія", "Коваль", "CD789012");

        // Квиток 1: купуємо за 20 днів (ціна базова)
        Ticket ticket1 = new Ticket(p1, flight, true, false, 20);

        // Квиток 2: купуємо за 3 дні до рейсу (ціна має зрости на 50%)
        Ticket ticket2 = new Ticket(p2, flight, true, true, 3);

        System.out.println(ticket1);
        System.out.println(ticket2);
    }
}