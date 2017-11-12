package Thom9521.Chapter_05.CaseStudy_Loops;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class For_Loop {
    public static void main(String[] args) {

        int i, j;

        for(j = 1; j<=5; j++) {
            for(i =1; i <=5; i++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
