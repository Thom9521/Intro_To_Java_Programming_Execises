package Thom9521.Chapter_02;//Opgave 2.8
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.util.Scanner;

public class Current_time_2_8 {
    public static void main(String[] args) {

        // Obtain the total milliseconds since the midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();



        // Obtain the total seconds since the midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;



        // Compute the current second in the minute in the hour
        int currentSecond = (int)(totalSeconds % 60);



        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;



        // Compute the current minute in the hour
        int currentMinute = (int)(totalMinutes % 60);



        // Obtain the total hours
        long totalHours = totalMinutes / 60;



        // Compute the current hour
        int currentHour = (int)(totalHours % 24+2);



        //Scanner som sørger for jeg kan indtaste noget i "run-felt"
        Scanner input = new Scanner(System.in);

        //Viser en tekst
        System.out.println("Indtast tidsforskel:");

        //Variabel for forskellen
        int forskel = input.nextInt();



        // Display results
        System.out.println("Current time is " + (currentHour + forskel) + ":"

                + currentMinute + ":" + currentSecond + " GMT");

    }

}
