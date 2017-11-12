package Thom9521.Chapter_10.Time_Class_10_1;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class Test_Time {
    public static void main(String[] args) {

        Time time1 = new Time();
        Time time2 = new Time(555550000);


        System.out.println(time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());


        System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());



    }
}
