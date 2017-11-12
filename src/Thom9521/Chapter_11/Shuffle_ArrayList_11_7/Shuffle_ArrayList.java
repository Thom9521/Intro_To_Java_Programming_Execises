package Thom9521.Chapter_11.Shuffle_ArrayList_11_7;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Shuffle_ArrayList {

    public static void main(String[] args) {

        //Ny arralist lavet
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Importerer scanner klassen
        Scanner input = new Scanner(System.in);

        //Udskriver tekst, og gør man kan indtaste tal
        System.out.println("Indtast en liste med tal, aflyst med 0");
        Integer number = input.nextInt();

        //Så længe man ikke skriver 0, så kan man blive ved med at indtaste nye tal
        while (number.intValue() != 0) {
            list.add(number);
            number = input.nextInt();
        }

        //Tilføjer blandingsmetoden
        shuffle(list);

        System.out.println("\nDine tal blandet:");
        //Udskriver talene fra listen
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
    }
    //Blander tallene i listen
    public static void shuffle(ArrayList<Integer> list){
        java.util.Collections.shuffle(list);

}
}