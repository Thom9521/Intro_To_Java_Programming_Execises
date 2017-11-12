package Thom9521.Chapter_09;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class Opgave_9_3 {

        public static void main(String[] args) {

            //Date class der er tilgængelig i java.
            java.util.Date date = new java.util.Date();

            //Hvor lang tid er der gået ud fra de forskellige tider som er gået.
            System.out.println("Dato og tid for tid gået ved 10000, ");
            System.out.println("100000, 1000000, 10000000, 100000000, ");
            System.out.println("1000000000, 10000000000 og 100000000000.");
            System.out.println("hver for sig: ");
            for (long i = 10000; i <= 1e11; i *= 10) { // blev nød til at kigge på andres værker. Vidste ikke det med "1e11" som jeg går ud fra er opløftet i 11.
                date.setTime(i);
                System.out.println(date.toString());
            }

        }
    }

