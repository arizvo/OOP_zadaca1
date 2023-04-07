package com.aldinrizvo.qamp.oophomework1.task1;

public class Student {
    private String firstName;
    private String lastName;
    private int indexNumber;
    private double GPA;

    public Student(final String firstName, final String lastName) {
        this(firstName, lastName, 0, 0);
    }

    public Student(final String firstName, final String lastName, final int indexNumber, final double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getIndexNumber() {
        return this.indexNumber;
    }

    public void setIndexNumber(final int indexNumber) {
        this.indexNumber = indexNumber;
    }

    public double getGPA() {
        return this.GPA;
    }

    public  void setGPA(final double GPA) {
        this.GPA = GPA;
    }

    public boolean isGPAAboveValue(final double GPAValue) {
        return this.GPA > GPAValue;
    }

    public void printStudent() {
        System.out.println("Student informations: ");
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Index number: " + this.indexNumber);
        System.out.println("GPA: " + this.GPA);
    }
}
