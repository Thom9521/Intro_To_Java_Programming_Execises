package Thom9521.Chapter_02;//Opgave 2.2
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.util.Scanner;

public class Compute_the_volume_of_a_triangle_2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Viser en tekst
        System.out.println("Længden for trekantens sider:");

        //Variabel for trekantens længde
        double trekantsLængde = input.nextDouble();


        //Tekst og udregning af arealet for trekanten
        System.out.println("Arealet for trekanten er " + (Math.pow(3,0.5)/4) * ((Math.pow(trekantsLængde,2))));

        //Tekst og udregning af trekantens volumen
        System.out.println("Volumen for trekanten er " + ((Math.sqrt(3)/4) * ((Math.pow(trekantsLængde,2)) * trekantsLængde)));
    }
}
