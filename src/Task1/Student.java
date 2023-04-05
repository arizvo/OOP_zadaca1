package Task1;

import org.w3c.dom.DOMStringList;

public class Student {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int indexNumber;

    public Student(final String firstName, final String lastName, final int birthYear) {
        this(firstName, lastName, birthYear, 0);
    }

    public Student(final String firstName, final String lastName, final int birthYear, final int indexNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.indexNumber = indexNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public int getIndexNumber() {
        return this.indexNumber;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public  void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public boolean checkIfStudentIsBornBeforeSpecificYear( final int year) {
        return this.birthYear < year;
    }

    public void printStudent() {
        System.out.println("Student informations: ");
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Birth year: " + this.birthYear);
        System.out.println("Index number: " + this.indexNumber);
    }
}
