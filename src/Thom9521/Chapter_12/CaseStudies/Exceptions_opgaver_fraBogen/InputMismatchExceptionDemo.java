package Thom9521.Chapter_12.CaseStudies.Exceptions_opgaver_fraBogen;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

    import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do{
            try{
                System.out.println("Indtast et helt tal: ");
                int number = input.nextInt();

                //Display yhe result
                System.out.println("Du har indtastet " + number);
                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Prøv igen. ("+ "Dette er ikke et helt tal: et helt tal er forventet)");
                input.nextLine(); //Discard input
            }
        }
        while (continueInput);
    }
}

