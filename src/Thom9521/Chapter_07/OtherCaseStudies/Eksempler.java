package Thom9521.Chapter_07.OtherCaseStudies;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class Eksempler {
    public static void main(String[] args) {

        double[] myList = new double[5];

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++)
            myList[i] = input.nextDouble();

        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }

            for (int i = 0; i < myList.length; i++) {
                System.out.println(myList[i] + " ");
            }
        System.out.println(" ");
            char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
        System.out.println(city);

            double total = 0;
        for (int i = 0; i < myList.length; i++){
            total += myList[i];
        }

        double max1 = myList[0];
        for(int i= 1; i < myList.length; i++) {
            if (myList[i] > max1) max1 = myList[i];
        }


        double max2 = myList[0];
        int indexOfMax = 0;
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max2) {
                max2 = myList[i];
                indexOfMax = i;
            }
        }

        for (int i = myList.length - 1; i > 0; i --) {
            //Generate an index j randomly with 0 <= j <= i
            int j= (int)(Math.random()*(i+1));

            //Swap myList[i] with myList[j]
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }

        double temp = myList[0]; //Retain the first element

        //Shift elements left
        for(int i = 1; i < myList.length; i++){
            myList[i-1] = myList[i];
        }
        //Move the first element to fill in the last position
        myList[myList.length - 1] = temp;

    }
}
