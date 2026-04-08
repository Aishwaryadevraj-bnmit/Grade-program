import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student name and marks
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks out of 100: ");
        double marks = scanner.nextDouble();

        // Calculate grade
        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Output result
        System.out.println("\nStudent Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}