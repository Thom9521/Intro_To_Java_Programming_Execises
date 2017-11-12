package Thom9521.Chapter_09.Opgave_9_2;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class Stock_UML {
    public static void main(String[] args) {

        Stock stock = new Stock("ORCL","Oracle Corporation");

       stock.previousClosingPrice = 34.5;
       stock.currentPrice = 34.35;

        System.out.println("Prisen i går: " + stock.previousClosingPrice + " kr");
        System.out.println("Prisen i dag: " + stock.currentPrice + " kr");
        System.out.println("Prisforskellen i procent fra den gamle pris til den nye pris er " + stock.getChangePercent());
}
}