package Thom9521.Chapter_02;//Opgave 2.3
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.util.Scanner;

public class Convert_meters_into_feet_2_3 {
    public static void main(String[] args) {

        //Sørger for at jeg kan indtaste noget i "run-feltet"
        Scanner input = new Scanner(System.in);

        //Viser en tekst
        System.out.println("Antal meter:");

        //Variabel for meter
        double meter = input.nextDouble();

        //Tekst og udrening af feet
        System.out.println(meter + " meter er det samme som " + meter * 3.2786 + " feet");
    }
}
