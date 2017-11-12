package Thom9521.Chapter_10.My_Point_10_4;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class MyPoint {

    private double x;
    private double y;

    public MyPoint() { //No-arg constructor, med x og y = 0 som default
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y){ //Specified constructor
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY(){
        return y;
    }

    public double distance(MyPoint myPoint){
        return Math.sqrt(Math.pow(myPoint.getX()-x,2) + Math.pow(myPoint.getY()- y,2));
    }

    public double distance(double x, double y) {
        return distance(new MyPoint(x, y));
    }

}
