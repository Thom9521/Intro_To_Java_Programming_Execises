package Thom9521.Chapter_12.CaseStudies.CircleWithExceptionss;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import Thom9521.Chapter_12.CaseStudies.CircleWithExceptionss.CircleWithException;

public class TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException c1 = new CircleWithException(5); //Ingen problemer, objektet bliver dannet
            CircleWithException c2 = new CircleWithException(-5); //Fejl så sender "catch" ud
            CircleWithException c3 = new CircleWithException(0); //Bliver ikke kørt da der er fejl i ovenstående
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }

        System.out.println("Number of objects created: " +
                CircleWithException.getNumberOfObjects());
    }
}