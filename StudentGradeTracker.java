package CodeAlpha;

import java.util.Scanner;

public class StudentGradeTracker {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int NumberOfStudents = scanner.nextInt();

        // Create arrays to store student names and grades
        String[] StudentNames = new String[NumberOfStudents]; // String type array for name.
        double[] StudentGrades = new double[NumberOfStudents]; // double type array for grades.

        // Input student names and grades
        for (int i = 0; i < NumberOfStudents; i++) {
            System.out.print("Please Enter the name of the student " + (i + 1) + ": ");
            StudentNames[i] = scanner.next();

            System.out.print("Please Enter the grade of student " + (i + 1) + ": ");
            StudentGrades[i] = scanner.nextDouble();
        }

        // Calculate average, highest, and lowest grades
        double sum = 0;
        double highestGrade = StudentGrades[0];
        double lowestGrade = StudentGrades[0];
        int highestIndex = 0;
        int lowestIndex = 0;

        for (int i = 0; i < NumberOfStudents; i++) {
            double grade = StudentGrades[i];
            sum = sum + grade;

            if (grade > highestGrade) {
                highestGrade = grade;
                highestIndex = i;
            }

            if (grade < lowestGrade) {
                lowestGrade = grade;
                lowestIndex = i;
            }
        }

        // Calculate average grade
        double averageGrade = sum / NumberOfStudents;

        // Display results
        System.out.println("\nGrade Summary:");
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Highest Grade: " + highestGrade + " (Student: " + StudentNames[highestIndex] + ")");
        System.out.println("Lowest Grade: " + lowestGrade + " (Student: " + StudentNames[lowestIndex] + ")");

        // Close the scanner resource
        scanner.close();
    }
}
