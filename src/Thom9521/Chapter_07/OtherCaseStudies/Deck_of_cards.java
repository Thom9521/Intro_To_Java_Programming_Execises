package Thom9521.Chapter_07.OtherCaseStudies;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class Deck_of_cards {
    public static void main(String[] args) {

    int[] deck = new int[52]; //Laver en array med 52 kort
    String[] suits = {"Spar", "Hjerter", "Ruder", "Klør"}; //Laver en array med korttyperne
    String[] ranks = {"Es", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Knægt", "Dame", "Konge"}; //Laver en array med kortnumrerne

    //Initialiserer kortene
    for (int i = 0; i < deck.length; i++) //Et loop, som får "i" til at starte i 0 og går frem til længden af deck array, hvor den går 1 op hver gang
        deck[i] = i; //Vælger "i" som er et tilfældigt kort

    //Blander kortene
        for (int i = 0; i < deck.length; i++) { //Et loop, som får "i" til at starte i 0 og går frem til længden af deck array, hvor den går 1 op hver gang
            //Genererer et index tilfældigt
            int index = (int)(Math.random() * deck.length); //Tager et random kort fra indexet
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        //Viser de første 2 kort
        for (int i = 0; i < 2; i++) { //Et loop som tager 2 tilfældige kort
            String suit = suits[deck[i]/13]; //Der bliver divideret med 13 fordi der er 4 af hvert kort (52/4 = 13)
            String rank = ranks[deck[i]%13];
            System.out.println("Kort nummer " + deck[i] + ": " + suit + " " + rank); //Skriver en tekst
        }

    }
}
