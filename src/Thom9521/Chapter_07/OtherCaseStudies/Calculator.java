package Thom9521.Chapter_07.OtherCaseStudies;//Gad ikke virke hvis classen lå i en package
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class Calculator {
    public static void main(String[] args) {


        if (args.length != 3) { //Hvis der ikke er 3 variabler så vil systemet ikke køre.
            System.out.println("Usage: java Calculator operand1 operator oprand2"); // bliver udskrevet hvis der ikke er 3
            System.exit(0);
        }
    int result = 0; //Variabel med startværdi 0

        switch (args[1].charAt(0)) {
            case '+': result = Integer.parseInt(args[0])+ Integer.parseInt(args[2]); // Hvis man bruger "+" så bliver denne case udvalgt
            break;

            case '-': result = Integer.parseInt(args[0])- Integer.parseInt(args[2]); // Hvis man bruger "-" så bliver denne case udvalgt
                break;

            case '.': result = Integer.parseInt(args[0])* Integer.parseInt(args[2]); // Hvis man bruger "." så bliver denne case udvalgt
                break;

            case '/': result = Integer.parseInt(args[0])/ Integer.parseInt(args[2]); // Hvis man bruger "/" så bliver denne case udvalgt
                break;

    }

        System.out.println(args[0]+ ' ' + args[1] + ' ' + args[2] + " = " + result); //Udskriver en tekst

    }
}
