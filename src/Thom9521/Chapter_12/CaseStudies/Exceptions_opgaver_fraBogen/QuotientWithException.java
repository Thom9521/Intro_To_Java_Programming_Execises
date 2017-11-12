package Thom9521.Chapter_12.CaseStudies.Exceptions_opgaver_fraBogen;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.util.Scanner;

public class QuotientWithException {
    public static int quotient(int tal1, int tal2) {
        if (tal2 == 0)
            throw new ArithmeticException("Man kan ikke dividere med nul...");
        return tal1 / tal2;
    }

    public static void main(String[] args) {



        Scanner input = new Scanner(System. in);

        System.out.println("Tast to tal ind som skal divideres med hinanden: ");
        int tal1 = input.nextInt();
        System.out.println("/");
        int tal2 = input.nextInt();


        try {
            int resultat = quotient(tal1, tal2);
            System.out.println("Resultatet af " + tal1 + " / " + tal2 + " er = " + resultat);
        }

        catch(ArithmeticException ex) {
            System.out.println("Man kan stadig ikke dividere med nul...");
        }
    }
}
