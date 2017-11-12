package Thom9521.Chapter_02;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.util.Scanner;
//2.23
public class Cost_of_driving_2_23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Tekst og variablen for distancen
        System.out.println("Distance for kørsel:");
        double distance = input.nextDouble();

        //Tekst og variablen for miles pr gallon
        System.out.println("Miles pr. gallon");
        double milesGallon = input.nextDouble();

        //Tekst og variabel for pris pr gallon
        System.out.println("Pris pr. gallon");
        double prisGallon = input.nextDouble();

        //Udregning af den samlede pris
        double samletPris = (distance / milesGallon) * prisGallon;

                //Tekst som viser den samlede pris
                System.out.println("Den samlede pris for kørslen er " + samletPris + " $");
    }
}
