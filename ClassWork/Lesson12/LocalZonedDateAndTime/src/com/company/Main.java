package com.company;

import java.time.*;

public class Main {

    public static void main(String[] args) {
        ZoneId centralEuropeanTimeZone = ZoneId.of("Europe/Amsterdam");

        LocalDate date = LocalDate.of(2020, 8, 8);
        LocalTime time = LocalTime.of(13, 23, 45);

        LocalDateTime dateTime = LocalDateTime.of(date, time);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, centralEuropeanTimeZone);

        System.out.println("Netherlands time in Amsterdam: " + zonedDateTime);
    }
}
