package com.airline;

public class Passenger {
    // Поля класу (приватні)
    private String firstName;
    private String lastName;
    private String passportId;

    // 2. Конструктор
    public Passenger(String firstName, String lastName, String passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (Паспорт: " + passportId + ")";
    }
}