package Thom9521.Chapter_10.Course_10_9;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class Test_Course {
    public static void main(String[] args) {

        Course course1 = new Course("course1"); //Lavet en Course vha. constructoren fra Course klassen

        course1.addStudent("Thomas"); //Tilføjer student
        course1.addStudent("Michael"); //Tilføjer student
        course1.addStudent("Niels"); //Tilføjer student


        course1.dropStudent("Niels"); //Fjerner student


        System.out.println(course1.getCurseName() + " har " + course1.getNumberOfStudents() + " studerende:"); //Tekst

        //Udskriver hvem der er i arrayet:
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }


    }
}