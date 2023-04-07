package com.aldinrizvo.qamp.oophomework1.task1;

public class StudentMain {
    public static void main(String[] args) {
        final Student freshmanStudent = new Student("Kemal", "Bizibar");
        final Student seniorStudent = new Student("Alex", "Bravo", 17587, 7.6);
        double GPAValue = 6.1;

        System.out.println("Students data: ");
        freshmanStudent.printStudent();
        System.out.println();
        seniorStudent.printStudent();

        if (seniorStudent.isGPAAboveValue(GPAValue)) {
            System.out.println("Student " + seniorStudent.getFirstName() + " " + seniorStudent.getLastName() + " has GPA greater than " + GPAValue + ".");
        } else {
            System.out.println("Student " + seniorStudent.getFirstName() + " " + seniorStudent.getLastName() + " has GPA less (or equal) than " + GPAValue + ".");
        }

        freshmanStudent.setIndexNumber(18554);
        freshmanStudent.setGPA(9.5);
        seniorStudent.setFirstName(freshmanStudent.getFirstName());
        seniorStudent.setIndexNumber(17777);

        System.out.println("\nStudents data after changing informations\n");
        freshmanStudent.printStudent();
        System.out.println();
        seniorStudent.printStudent();
    }
}
