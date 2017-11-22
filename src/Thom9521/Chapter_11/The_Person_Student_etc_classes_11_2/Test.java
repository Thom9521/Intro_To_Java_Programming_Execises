package Thom9521.Chapter_11.The_Person_Student_etc_classes_11_2;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("Senior");
        System.out.println(student1.toString());

        System.out.println();

        Employee employee1 = new Employee("Første sal", 35265);
        System.out.println(employee1.toString());

        System.out.println();

        Staff staff1 = new Staff("Salgsdirektør");
        System.out.println(staff1.toString());

        System.out.println();

        Faculty faculty1 = new Faculty(356, "Chef");
        System.out.println(faculty1.toString());
    }
}
