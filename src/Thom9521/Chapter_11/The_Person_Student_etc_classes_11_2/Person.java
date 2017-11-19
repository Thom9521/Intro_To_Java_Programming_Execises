package Thom9521.Chapter_11.The_Person_Student_etc_classes_11_2;

public class Person {

    //Deklarerer og initialiserer datafields
    private String name = "";
    private String address = "";
    private int phoneNumber = 0;
    private String email = "";

    //No-arg constructor
    public Person(){
    }

    //Constructor
    public Person(String name, String address, int phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }

    //Metoder til setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
