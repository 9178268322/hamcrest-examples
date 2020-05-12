package entities;

import java.time.LocalDate;

public class Flight {

    private String fromDest;
    private String toDest;
    private LocalDate date;
    private int passengerNum;

    public Flight(String fromDest, String toDest, LocalDate date, int passengerNum) {
        this.fromDest = fromDest;
        this.toDest = toDest;
        this.date = date;
        this.passengerNum = passengerNum;
    }

    public String getFromDest() {
        return fromDest;
    }

    public String getToDest() {
        return toDest;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getPassengerNum() {
        return passengerNum;
    }
}
