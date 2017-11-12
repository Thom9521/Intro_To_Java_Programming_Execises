package Thom9521.Chapter_11.Use_ArrayList_11_6;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

import java.util.ArrayList;
import java.util.Date;

public class Use_ArrayList_11_6 {

    public static void main(String[] args) {

        //Laver arraylisten
        ArrayList<Object> o = new ArrayList<>();


        //Tilføjer objekter til arraylisten
        o.add(new Date());
        o.add(new String("String added"));
        o.add(new Loan());
        o.add(new Circle());

    

        //Loop som udskriver objekterne fra klassen, så længe der er nogen.
        for(int i = 0; i < o.size(); i++){
            System.out.println((o.get(i)).toString());
        }

    }

}
