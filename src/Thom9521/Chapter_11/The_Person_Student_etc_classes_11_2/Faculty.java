package Thom9521.Chapter_11.The_Person_Student_etc_classes_11_2;

public class Faculty extends Employee {

    private int officeHours;
    private String rank;

    public Faculty(){}

    public Faculty(String office, int salary) {
        super(office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
        public Faculty(int officeHours, String rank){
            super("Stueetage", 6595624);
            this.officeHours = officeHours;
            this.rank = rank;
    }

    public String toString(){
            return "Personalet (faculty) er blevet tilføjet til opgaven. De har hovedkvarter på salen: '" +
                    this.getOffice() + "' og har en fælles månedsløn på " + this.getSalary() + "kr og deres fælles timer på" +
                    "kontoret er " + this.officeHours + " om ugen og de har alle sammen rank, men den største rank er " +
                    this.rank + ".";
    }

}
