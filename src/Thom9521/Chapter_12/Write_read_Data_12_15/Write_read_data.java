package thom9521.Write_read_Data_12_15;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.util.Scanner;

public class Write_read_data {
    public static void main(String[] args) throws java.io.IOException {
        java.io.File file = new java.io.File("Exercise12_15.txt"); //Laver en fil
        if (file.exists()) { //Hvis filen allerede findes så udskrivedes nedenstående tekst:
            System.out.println("File already exists");
            //System.exit(0);
        }


        try(
        java.io.PrintWriter output = new java.io.PrintWriter(file); //Kode for at kunne skrive i filen
        ){
            for(int i = 0; i < 120; i++){ //Genererer tal op til 120
                output.println(((int)(Math.random()*120)+1)); //Genererer mellem 1 - 120 forskellige tal
                output.print(" "); //Sørger for der kommer mellemrum mellem tallene
            }
        }

        // Scanner filen
        Scanner input = new Scanner(file);

        // Læser dataen fra filen
        while (input.hasNext()) {

            int score = input.nextInt();
            System.out.println(score); //Scoren bliver vist
        }

        // Lukker filen
        input.close();

        //Hvordan får man tallene i orden?????
    }
}
