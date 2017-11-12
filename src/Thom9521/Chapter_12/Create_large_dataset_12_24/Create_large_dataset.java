package thom9521.Create_large_dataset_12_24;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Create_large_dataset {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Salary.txt"); //Jeg laver en ny fil kaldet "Salary.txt"

        if (file.exists()){ //Hvis filen allerede findes udskrives nedenstående tekst og programmet afsluttes
            System.out.println("Filen " + file.getName() + " findes allerede");
            System.exit(0);
        }
        //Data fields:
        String rank = "";
        double løn;
        try(
                PrintWriter output = new PrintWriter(file); //Sørger for der bliver printet tekst i den dannede fil
                ) {
            for (int i = 1; i <= 1000; i++){ //Loop som fortsætter op til 1000
                output.print("FirstName" + i + " LastName" + i); //Udskriver FN og LN i hver linje plus tallet "i".
                rank = getRank(); //Henter en rank
                løn = getLøn(rank); //Henter en løn ud fra ranken
                output.printf(" " + rank + " %.2f\n", løn); //Udskriver ranken og lønnen
            }
        }
    }

    public static String getRank(){ //Metode til rank
        String[] ranks = {"assistant", "associate", "full"}; //Array som indeholder disse 3 ranks.
        return ranks[(int)(Math.random()*ranks.length)]; //Henter en tilfældig rank
    }

    public static double getLøn(String rank) { //Metode til løn
        if (rank.equals("assistant")) //Hvis ranken bliver assistant får personen følgende løn:
            return 50000 + (double)(Math.random()*30001);

            else if (rank.equals("associate")) //Hvis ranken bliver associate får personen følgende løn:
                return 60000 + (double)(Math.random()*50001);

                else
                    return 75000 + (double)(Math.random()*55001); /*Hvis ranken bliver noget andet en de andre 2 så
         får personen følgende løn (altså ranken "full"): */
    }
}
