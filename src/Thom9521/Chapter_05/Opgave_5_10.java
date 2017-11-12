package Thom9521.Chapter_05;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class Opgave_5_10 {
    public static void main(String[] args) {

        int i;

        for(i=100; i<=1000; i++){
            if(i % 3 == 0 && i % 4 == 0){
                System.out.print(i + " ");
            }
        }

    }
}
