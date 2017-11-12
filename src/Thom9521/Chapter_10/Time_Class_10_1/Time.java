package Thom9521.Chapter_10.Time_Class_10_1;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class Time {

    //Declarer variabler
    private int tHour;
    private int tMinute;
    private int tSecond;
    private long tTime;

public Time(){ // No-arg constructor
    tTime = System.currentTimeMillis();

}

public Time(long time){ //Constructor med specified elapsed time
    tTime = time;

}

public Time(int hour, int minute, int second){ //Constructor med specified hour, minute, second
    this.tHour = hour;
    this.tMinute = minute;
    this.tSecond = second;
}


public int getHour(){ //Metode for at få antal timer
    return (int)(tTime / (1000*60*60)) % 24+ 2;
}

public int getMinute(){ //Metode for at få antal minutter
    return (int)(tTime /(1000*60)) % 60; }

public int getSecond(){ //Metode for at få antal sekunder
    return (int)(tTime / 1000) % 60; }

public void setTime(long elapseTime){ //Metode som bruger elapsed time
        this.tTime = elapseTime;
    }

}
