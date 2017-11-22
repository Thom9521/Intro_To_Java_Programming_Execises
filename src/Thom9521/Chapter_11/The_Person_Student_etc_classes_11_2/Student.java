package Thom9521.Chapter_11.The_Person_Student_etc_classes_11_2;

public class Student extends Person {

    //Constant datafield
    private String STATUS;


public Student(String name, String address, int phoneNumber, String email){
    super(name, address, phoneNumber, email);
    this.STATUS = STATUS;


}

public Student(final String STATUS){
    super("Alex","Vej1",123456789,"Alex@mail.com");
    this.STATUS = STATUS;
    }

@Override
    public String toString(){
    return "En student er dannet og personen har navnet med titlen " + this.STATUS + " " + this.getName() + "" +
            " og han bor på " + this.getAddress() + " og hans telefonnummer er " + this.getPhoneNumber()
            + " og han har mailen " + this.getEmail();
}

}
