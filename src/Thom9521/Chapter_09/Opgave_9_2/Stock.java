package Thom9521.Chapter_09.Opgave_9_2;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class Stock {

    //Variable for symbol og navn
    String symbol;
    String name;

    //Variabler for prisere
    double previousClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName){
        symbol =newSymbol;
        name = newName;

    }

    //Udregner forskellen af priserne i procent
    double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice)*100;
    }
}
