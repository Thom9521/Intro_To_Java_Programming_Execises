package Thom9521.Chapter_05.CaseStudy_Loops;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.util.Scanner;

public class GuessANumber {


        public static void main(String[] args) {
            // Generate a random number to be guessed
            int number = (int)(Math.random() * 101);

            Scanner input = new Scanner(System.in);
            System.out.println("Gæt et magisk nummer mellem 0 og 100");

            // Prompt the user to guess the number
            System.out.print("\nIndtast dit gæt: ");
            int guess = input.nextInt();

            if (guess == number)
                System.out.println("Ja, nummeret er " + number + " :)");
            else if (guess > number)
                System.out.println("Dit gæt er for højt :(");
            else
                System.out.println("Dit gæt er for lavt :(");



            //Loop som bliver ved med at spørge om et nyt tal ind til det bliver det rigtige.
            while ( guess != number) {
                System.out.println("");
                System.out.println("Gæt igen:");

                guess = input.nextInt();
                if (guess == number)
                    System.out.println("Ja, nummeret er " + number + " :)");
                else if (guess > number)
                    System.out.println("Dit gæt er for højt :(");
                else
                    System.out.println("Dit gæt er for lavt :(");

            }
        }
    }

