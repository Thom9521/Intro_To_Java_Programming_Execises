package thom9521.Process_scores_in_a_text_file_12_14;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.io.File;
import java.util.Scanner;

public class Process_scores_in_a_text_file {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); //Henter scanneren

        System.out.println("Indtast en fil med en score: "); //Udskriver tekst
        File fil = new File(input.nextLine()); //Input så man kan indtaste sit filnavn

        if (!fil.exists()) { //Hvis filen som bliver indtastet ikke findes så udskriven nedstående tekst:
            System.out.println("Filen " + fil +  " findes ikke.");
            System.exit(0);
        }

        int count = 0; //Genererer og intializerer variablen
        double total = 0; //Genererer og intializerer variablen

        try (Scanner inputFil = new Scanner(fil); //Scanner filen som bliver indtasten
        ) {
            while (inputFil.hasNext()) { //Loop
                total += inputFil.nextInt(); //Regner totalsummen ud
                count++; //Tæller alle de score som er i filen
            }
        }
        System.out.println("Filnavn: " + fil.getName()); //Udskriver en masse tekst
        System.out.println("Total score: " + total);
        System.out.println("Gennemsnitlig score " + (total / count));
    }
}