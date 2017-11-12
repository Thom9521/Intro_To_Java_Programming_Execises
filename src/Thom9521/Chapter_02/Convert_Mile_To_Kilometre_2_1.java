package Thom9521.Chapter_02;//Opgave 2.1
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.util.Scanner;

public class Convert_Mile_To_Kilometre_2_1 {

    public static void main(String[] args) {

        //Sørger for at jeg kan indtaste noget nede i "run-feltet"
        Scanner input = new Scanner(System.in);

        //Viser en tekst
        System.out.println("Antal miles");

        //En variabel for "mile"
        double mile = input.nextDouble();

        //Omregner miles til kilometer og skriver en tekst
        System.out.println(mile + " miles svarer til " + mile * 1.6 + " kilometer");




    }
}
