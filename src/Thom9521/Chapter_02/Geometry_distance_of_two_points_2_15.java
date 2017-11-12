package Thom9521.Chapter_02;//Opgave 2.15
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.util.Scanner;

public class Geometry_distance_of_two_points_2_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Viser en tekst
        System.out.println("Punkt x1 og y1");

        //Variabler for x1 og y1
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        //Viser en tekst
        System.out.println("Punkt x2 og y2");

        //Variabler for x2 og y2
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();


        //Udregning af afstanden
        double afstand = Math.pow(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2),0.5);

        //Tekst og visning af udregningen
        System.out.println("De to punkters afstand er " + afstand);
    }
}
