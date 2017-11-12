package thom9521.Array_Exception_12_3;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Laver scanner

        int[]array = getArray(); //getArray metode

        System.out.println("Indtast indekset for array'et"); //Udskriver tekst
        try{ //Try bliver kørt hvis man indtaster et tal inden for 120
            System.out.println("Den tilsvarende element størrelse er " + array[input.nextInt()]); /*Tekst og indekst på
            array'et */

        }
        catch (java.lang.ArrayIndexOutOfBoundsException ex) { //catch bliver kørt hvis det er højere end 120
            System.out.println("Out of Bounds");
        }
        }

        public static int[] getArray(){ /*Et array med et indeks på 120, som genererer tilfældige værdier inden for
            120*/
            int[] array = new int[120];
            for (int i= 0; i < array.length; i++){
                array[i]= (int)(Math.random()*120)+1;
            }
            return array;
        }
    }


