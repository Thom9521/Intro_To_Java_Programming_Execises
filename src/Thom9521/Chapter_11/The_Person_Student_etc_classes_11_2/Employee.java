package Thom9521.Chapter_11.The_Person_Student_etc_classes_11_2;

public class Employee extends Person {



    private String office;
    private int salary;

    public Employee(){}

    public Employee(String name, String address, int phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
    }


        public Employee(String office, int salary){
            super("Andy","Vej2",904564564,"Andy@mail.com");
            this.office = office;
            this.salary = salary;

        }

        @Override
    public String toString(){
            return "En employee er dannet med navnet " + this.getName() + ", adressen " + this.getAddress() +
                    ", telefonnummeret " + this.getPhoneNumber() + ", emailen " + this.getEmail() + ". Han har kontor" +
                    " på " + this.office + " og får lønnen " + this.salary + "kr om måneden";
        }



    //Getters and setter
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    }
