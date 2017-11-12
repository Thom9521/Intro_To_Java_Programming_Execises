package Thom9521.Chapter_10.Course_10_9;
/*
Author: Thomas Christensen
Date: 12/11-2017
Email: Thomas96mc@gmail.com
 */

public class Course {

    private String courseName;
    private String[] students = new String[200];
    private int numberOfStudents;

    public Course(String courseName){ //Constructor som sætter navnet på course
        this.courseName = courseName;
    }
    public  void  addStudent(String student){ //Metode som tilføjer en student til array
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents(){ //Metode som fortæller hvem der er i array
        return students;
    }
    public int getNumberOfStudents(){ //Metode som foræller hvor mange der er i array
        return numberOfStudents;
    }
    public String getCurseName(){ //Metode som fortæller navnet på arrayet
        return courseName;
    }
    public void dropStudent(String student){ //Fjerner en student
        students[numberOfStudents] = student;
        numberOfStudents--;
    }
    public void clear(){ //Fjerner alle students
        numberOfStudents = 0;
    }

}
