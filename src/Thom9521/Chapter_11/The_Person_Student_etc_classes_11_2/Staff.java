package Thom9521.Chapter_11.The_Person_Student_etc_classes_11_2;

public class Staff extends Employee {

    private String title;

    public Staff(){}

    public Staff(String office, int salary) {
        super(office, salary);
        this.title = title;
    }

    public Staff(String title){
        super("Sal 3", 20200);
        this.title = title;

    }

    @Override
    public String toString(){
        return "Så er der også dannet en Staff, som har kontor på " + this.getOffice() + ", en løn på "
                + this.getSalary() + " og titlen: " + this.title;
    }
}