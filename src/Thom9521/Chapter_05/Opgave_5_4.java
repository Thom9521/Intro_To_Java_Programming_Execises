package Thom9521.Chapter_05;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class Opgave_5_4 {
    public static void main(String[] args) {

        int inches; //Deklarerer variablen

        System.out.println("Inches" + "     Centimetres"); //Udkskriver en tekst

        for (inches=0; inches <= 10; inches++) { //Laver et loop, som starter i 0 og slutter med 10, og lægger 1 til hver gang
            System.out.println(inches + "           " + inches*2.54); //Udksriver tekst og udregner centimeters

            }

    }
}
