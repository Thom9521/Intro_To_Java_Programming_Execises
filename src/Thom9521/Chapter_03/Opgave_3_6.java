package Thom9521.Chapter_03;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.util.Scanner;

public class Opgave_3_6 {
    public static void main(String[] args) {

        //Jeg laver en scanner for højde og vægt
        Scanner vaegt = new Scanner(System.in);
        Scanner hoejde = new Scanner(System.in);

        //Indtaster min vægt
        System.out.println("Indtast vægt i kg: ");
        double v = vaegt.nextDouble();

        //Indtaster min højde
        System.out.println("Indtast højde i meter: ");
        double h = hoejde.nextDouble();



        System.out.println("");

        //Udregner bmi
        double bmi = ((v)/(Math.pow(h,2)));

        //Indtaster min bmi
        System.out.println("Din bmi er: " + bmi);


        //En masse if og if else, hvor end ens bmi ligger
        if (bmi <= 18.5) {
            System.out.println("Du er undervægtig!");
        }

        else if (bmi <= 25){
            System.out.println("Du er normalvægitig!");
        }
        else if (bmi <= 30) {
            System.out.println("Du er overvægtig!");
        }

        else if (bmi<= 40) {
            System.out.println("Du er er i fedme klassen!");
        }
        else if(bmi > 40) {
            System.out.println("Du er i svær fedme klassen");
        }
        }

    }

