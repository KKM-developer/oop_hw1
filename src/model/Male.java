package model;

public class Male extends Person {


    public Male(String firstname, String lastname, String dateBirth, Family family) {
        super(firstname, lastname, dateBirth, family);
    }

    @Override
    public void printInfo() {
        System.out.println(this.firstname + " " + this.lastname + " " + this.dateBirth);
    }
}