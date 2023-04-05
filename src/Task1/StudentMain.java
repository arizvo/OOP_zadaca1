package Task1;

public class StudentMain {
    public static void main(String[] args) {
        final Student freshmanStudent = new Student("Kemal", "Bizibar", 2002);
        final Student seniorStudent = new Student("Alex", "Bravo", 1997, 17587);

        System.out.println("Students data: ");
        freshmanStudent.printStudent();
        System.out.println("");
        seniorStudent.printStudent();

        if (freshmanStudent.checkIfStudentIsBornBeforeSpecificYear(2002)) {
            System.out.println("\nStudent " + freshmanStudent.getFirstName() + " " + freshmanStudent.getLastName() + " is born before 2002.");
        } else {
            System.out.println("\nStudent " + freshmanStudent.getFirstName() + " " + freshmanStudent.getLastName() + " is born after 2002.");
        }

        if (seniorStudent.checkIfStudentIsBornBeforeSpecificYear(2002)) {
            System.out.println("Student " + seniorStudent.getFirstName() + " " + seniorStudent.getLastName() + " is born before 2002.");
        } else {
            System.out.println("Student " + seniorStudent.getFirstName() + " " + seniorStudent.getLastName() + " is born after 2002.");
        }

        freshmanStudent.setIndexNumber(18554);
        seniorStudent.setFirstName(freshmanStudent.getFirstName());
        seniorStudent.setIndexNumber(1777);

        System.out.println("\nStudents data after changing informations\n");
        freshmanStudent.printStudent();
        System.out.println("");
        seniorStudent.printStudent();
    }
}
