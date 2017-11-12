package Thom9521.Chapter_10.BMI_10_2;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class UseBMIClass {
    public static void main(String[] args) {

        BMI bmi1 = new BMI("Thomas", 21, 63, 1.77);
        System.out.println("The BMI for " + bmi1.getName() + " with the age " + bmi1.getAge() + " years old, is " + bmi1.getBMI() + " " + bmi1.getStatus());

        System.out.println("");

        BMI bmi2 = new BMI("Batman", 30, 85, 1.85);
        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());

        System.out.println("");

        BMI bmi3 = new BMI("Dorit", 20, 110, 1.63);
        System.out.println("The BMI for " + bmi3.getName() + " is " + bmi3.getBMI() + " " + bmi3.getStatus());
    }
}