package Thom9521.Chapter_03;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class Opgave_3_4 {
    public static void main(String[] args) {


int randomMonth = (int)(Math.random()*12 +1); //En random generator, som vælger et tal fra 1 til 12 (+1 så den ikke vælger 0)

            //Udskriver tekst
            System.out.println("Her er en random måned:");

            //Viser valgmulighederne fra 1 til 12
            switch (randomMonth) {
                    case 1: //Eksempel 1
                            System.out.println("Januar");
                            break;
                    case 2:
                            System.out.println("Februar");
                            break;
                    case 3:
                            System.out.println("Marts");
                            break;
                    case 4:
                            System.out.println("April");
                            break;
                    case 5:
                            System.out.println("Maj");
                            break;
                    case 6:
                            System.out.println("Juni");
                            break;
                    case 7:
                            System.out.println("Juli");
                            break;
                    case 8:
                            System.out.println("August");
                            break;
                    case 9:
                            System.out.println("September");
                            break;
                    case 10:
                            System.out.println("Oktober");
                            break;
                    case 11:
                            System.out.println("November");
                            break;
                    case 12:
                            System.out.println("December");
                            break;
            }


    }
}
