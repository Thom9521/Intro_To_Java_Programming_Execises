package Thom9521.Chapter_05;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.util.Scanner;

public class Opgave_5_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Deklarerer scanner

        int antalPoint = -100; //Deklarerer og intializerer antalPoint

        while (antalPoint != -1) { //Så længde antalPoint ikke er = -1 så hvil loopet fortsætte med at køre.
            System.out.println("Indtast den mængde point du har scoret:"); //Udkskriver en tekst
            antalPoint = input.nextInt(); //Nu kan jeg indtaste et tal

            if (antalPoint < 60) { //Laver en if, som gør at hvis tallet man indtaster er mindre end 60 så udkskrives:
                System.out.println("Du har desværre ikke bestået eksamen, da man skal have 60 eller flere point");
            }

            else if (antalPoint >= 60) { //Laver en else if, som udskriver nedenstående, hvis ens point er 60 eller mere.
                System.out.println("Tillykke, du har bestået eksamen");
            }

            }

        }

    }