package com.zetcode;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaLocalTimeCreate {

    public static void main(String[] args) {

        // Current Time
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        // Specific Time
        LocalTime time2 = LocalTime.of(7, 20, 45, 342123342);
        System.out.println(time2);

        // Specific Time
        LocalTime time3 = LocalTime.parse("12:32:22", 
            DateTimeFormatter.ISO_TIME);
        System.out.println(time3);
        
        // Retrieving from LocalDateTime
        LocalTime time4 = LocalDateTime.now().toLocalTime();
        System.out.println(time4);
    }
}
