package Thom9521.Chapter_03;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.util.Scanner;

public class Opgave_3_17 {
    public static void main(String[] args) {

        Scanner random = new Scanner(System.in); //Jeg laver en scanner så jeg kan indtaste noget i run-felt

        int computerValg = (int) (Math.random()*3); //Definerer en variablen som vælger mellem 0,1,2

        System.out.println("Du har tre mulighder: \n 0: saks \n 1: sten \n 2: papir \n Indtast dit valg:"); //Udskriver en tekst

        int spillersValg = random.nextInt(); //Input, som gør spilleren kan vælge et tal

        if (computerValg == spillersValg) { //Laver en if, som gør at hvis computer og spiller vælger det samme så udksrives teksten under
            System.out.println("Uafgjort");
        }
        else { // Laver en else, som gør at hvis det ikke bliver uafgjort så bliver der udført nedenunder:
            boolean resultat = (spillersValg == 0 && computerValg == 2) //alle disse tilfælde er at spiller vinder
                    ||  (spillersValg == 1 && computerValg == 0)
                    ||  (spillersValg == 2 && computerValg == 1);

            if (resultat == true) { //hvis true så har spilleren vundet og der bliver udskrevet:
                System.out.println("Spilleren vandt!");
            }
            else { //Hvis ikke spiller vinder men false, så bliver nedenunder udskrevet.
                System.out.println("Computeren vandt!");
            }
        }

    }
}
