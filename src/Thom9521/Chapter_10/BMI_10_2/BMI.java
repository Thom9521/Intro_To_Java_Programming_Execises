package Thom9521.Chapter_10.BMI_10_2;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class BMI {
    private String name;
    private int age;
    private double weight; //I kilo
    private double height; // I meter

    //Constructor
    public BMI(String name, int age, double weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public double getBMI() {
        double bmi = (weight / (Math.pow(height,2))); //Udregner BMI
        return Math.round(bmi * 100) / 100.0; //Runder tallet op til 2 decimaler.
    }

    public String getStatus(){
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public double getHeight(){
        return height;
    }

}
