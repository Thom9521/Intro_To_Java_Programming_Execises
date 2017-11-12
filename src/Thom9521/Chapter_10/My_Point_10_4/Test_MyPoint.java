package Thom9521.Chapter_10.My_Point_10_4;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class Test_MyPoint {
    public static void main(String[] args) {

        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10,30.5);

        System.out.println("Afstanden mellem " + point1.getX() + ", " + point1.getY() + " og " + point2.getX() + ", " +
                point2.getY() + " er " + point1.distance(point2));

    }
}